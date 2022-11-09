package com.douzone.comet.service.eh.ehsevr;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00500_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00500;
import com.douzone.comet.service.util.api.models.scm.SCMApiProvider_Ps_ResultData;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.jdbc.transaction.DbTransaction;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;
import com.douzone.gpd.restful.model.DzGridModel;

/** 
  * @description : 전력량계등록
  * @Since   : 2022.11.09
  * @Author  : 최진웅
  */
@DzApiService(value="Ehsevr00500_Service", module=CometModule.EH, desc="전력량계등록", version ="1.0.22110901")
public class Ehsevr00500_Service extends DzCometService {

	@Autowired
	Ehsevr00500_DAO Ehsevr00500_dao;
	
	@Autowired
	DzMybatisSupport mybatisSupport;

	@DzApi(url="/Ehsevr00500_list", desc="전력량계등록-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00500> Ehsevr00500_list(
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="whm_nm", desc="배출시설명", paramType=DzParamType.QueryString) String whm_nm
	) throws Exception {
		List<Ehsevr00500> list =  new ArrayList<Ehsevr00500>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();
			
			parameters.put("P_COMPANY_CD", this.getCompanyCode());
			parameters.put("P_PLANT_CD", plant_cd);
			parameters.put("P_WHM_NM", whm_nm);
			
			list = Ehsevr00500_dao.list("selectList", parameters);
	 	} catch(Exception e) {
	 		throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
				: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    
	    return list;
 	}
	
	@DzApi(url = "/Ehsevr00500_save", desc = "전력량계등록 저장", httpMethod = DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData Ehsevr00500_save(
			@DzParam(key = "mstGird_ds", desc = "전력량계등록", paramType = DzParamType.Body) DzGridModel<Ehsevr00500> mstGird_ds
			) throws Exception {
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
		try {
			transaction = this.beginTransaction();
			Integer cnt = 0;
			
			if (mstGird_ds != null) {
				if (mstGird_ds.getDeleted().size() > 0) {
					Ehsevr00500_dao.deleteEhsevr00500(mstGird_ds.getDeleted());
				}
				if (mstGird_ds.getUpdated().size() > 0) {
					Ehsevr00500_dao.updateEhsevr00500(mstGird_ds.getUpdated());
				}
				if (mstGird_ds.getAdded().size() > 0) {
					for (Ehsevr00500 item : mstGird_ds.getAdded()) {
						cnt = mybatisSupport.selectOne(MyBatisUtil.getId(this.getClass(), "dao.Ehsevr00500_DAO.mstDupCheck"),item);
						if(cnt > 0){
							mResult.setSuccess(false);
							mResult.setMsg("중복된 데이터는 입력할 수 없습니다.");
							transaction.rollback();
							return mResult;
						}
					}
					Ehsevr00500_dao.insertEhsevr00500(mstGird_ds.getAdded());
				}
			}
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
		mResult.setSuccess(true);
		return mResult;
	}
}

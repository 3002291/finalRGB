package com.douzone.comet.service.eh.ehsevr;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00300_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00300;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00300Drop1;
import com.douzone.comet.service.util.api.models.scm.SCMApiProvider_Ps_ResultData;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;
import com.douzone.comet.service.util.print.PrintUtil;
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
  * @description : 용수공급원등록
  * @Since   : 2022.11.07
  * @Author  : 최진웅
  */
@DzApiService(value="Ehsevr00300_Service", module=CometModule.EH, desc="용수공급원등록", version ="1.0.22110701")
public class Ehsevr00300_Service extends DzCometService {

	@Autowired
	Ehsevr00300_DAO Ehsevr00300_dao;
	
	@Autowired
	DzMybatisSupport mybatisSupport;
	
	@Autowired
	PrintUtil printUtil;
	

	@DzApi(url="/ehsevr00300_list", desc="용수공급원등록-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00300> ehsevr00300_list(
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="wt_scspl_nm", desc="용수공급원명", paramType=DzParamType.QueryString) String wt_scspl_nm
	) throws Exception {
		List<Ehsevr00300> list =  new ArrayList<Ehsevr00300>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();
			
			parameters.put("P_COMPANY_CD", this.getCompanyCode());
			parameters.put("P_PLANT_CD", plant_cd);
			parameters.put("P_WT_SCSPL_NM", wt_scspl_nm);
			
			list = Ehsevr00300_dao.list("selectList", parameters);
	 	} catch(Exception e) {
	 		throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
				: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    
	    return list;
 	}
 	
	@DzApi(url="/ehsevr00300_drop1", desc="환경구분 드롭다운리스트", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00300Drop1> ehsevr00300_drop1(
	) throws Exception {
		List<Ehsevr00300Drop1> list =  new ArrayList<Ehsevr00300Drop1>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();
			
			parameters.put("P_COMPANY_CD", this.getCompanyCode());

			list = Ehsevr00300_dao.listDrop(".selectDrop1", parameters);
	 	} catch(Exception e) {
	 		throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
				: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    
	    return list;
 	}
	
	@DzApi(url = "/ehsevr00300_save", desc = "용수공급원등록 저장", httpMethod = DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData ehsevr00300_save(
			@DzParam(key = "mstGird_ds", desc = "용수공급원등록", paramType = DzParamType.Body) DzGridModel<Ehsevr00300> mstGird_ds
			) throws Exception {
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
		try {
			transaction = this.beginTransaction();
			Integer cnt = 0;
			
			if (mstGird_ds != null) {
				if (mstGird_ds.getDeleted().size() > 0) {
					Ehsevr00300_dao.deleteEhsevr00300(mstGird_ds.getDeleted());
				}
				if (mstGird_ds.getUpdated().size() > 0) {
					Ehsevr00300_dao.updateEhsevr00300(mstGird_ds.getUpdated());
				}
				if (mstGird_ds.getAdded().size() > 0) {
					for (Ehsevr00300 item : mstGird_ds.getAdded()) {
						cnt = mybatisSupport.selectOne(MyBatisUtil.getId(this.getClass(), "dao.Ehsevr00300_DAO.mstDupCheck"),item);
						if(cnt > 0){
							mResult.setSuccess(false);
							mResult.setMsg("중복된 데이터는 입력할 수 없습니다.");
							transaction.rollback();
							return mResult;
						}
					}
					Ehsevr00300_dao.insertEhsevr00300(mstGird_ds.getAdded());
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

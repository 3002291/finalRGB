package com.douzone.comet.service.eh.ehsevr;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00400_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00400;
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
  * @description : 페수구분관등록
  * @Since   : 2022-11-02
  * @Author  : 이태훈
  * @History :
  */
@DzApiService(value="Ehsevr00400_Service", module=CometModule.EH, desc="기준정보관리 - 환경기준정보", version ="1.0.22110801")
public class Ehsevr00400_Service extends DzCometService {

	@Autowired
	Ehsevr00400_DAO Ehsevr00400_DAO; 
	
	@Autowired
	DzMybatisSupport mybatisSupport;

	@DzApi(url="/ehsevr00400_list", desc="폐수구분관등록-mstGrid-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00400> ehsevr00400_list(
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="wtwt_dschfclt_nm", desc="사업장", paramType=DzParamType.QueryString) String wtwt_dschfclt_nm,
			@DzParam(key="company_cd", desc="사업장", paramType=DzParamType.QueryString) String company_cd
			) throws Exception {
		List<Ehsevr00400> ehsevr00400List =  new ArrayList<Ehsevr00400>();
		try {
	 		HashMap<String, Object> parameters = new HashMap<String, Object>();
	 		parameters.put("P_PLANT_CD", plant_cd);
	 		parameters.put("P_WTWT_DSCHFCLT_NM", wtwt_dschfclt_nm);
	 		parameters.put("P_COMPANY_CD", company_cd);
	 		ehsevr00400List = Ehsevr00400_DAO.selectList("selectList", parameters);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
	        			: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    return ehsevr00400List;
 	}
 	
 	@DzApi(url="/ehsevr00400_ddl", desc="폐수구분관등록-드롭다운리스트-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00400> ehsevr00400_ddl(
			@DzParam(key="company_cd", desc="사업장", paramType=DzParamType.QueryString) String company_cd
			) throws Exception {
		List<Ehsevr00400> ehsevr00400List =  new ArrayList<Ehsevr00400>();
		try {
	 		HashMap<String, Object> parameters = new HashMap<String, Object>();
	 		parameters.put("P_COMPANY_CD", company_cd);
	 		ehsevr00400List = Ehsevr00400_DAO.selectList("ddl", parameters);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
	        			: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    return ehsevr00400List;
 	}
 	
 
	@DzApi(url = "/ehsevr00400_save", desc = "페수구분관등록-저장", httpMethod = DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData ehsevr00400_save(
			@DzParam(key = "mstGird_ds", desc = "페수구분관등록리스트", paramType = DzParamType.Body) DzGridModel<Ehsevr00400> mstGird_ds
			) throws Exception {
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
		try {
			transaction = this.beginTransaction();
			Integer cnt = 0;
			
			if (mstGird_ds != null) {
				if (mstGird_ds.getDeleted().size() > 0) {
					Ehsevr00400_DAO.deleteEhsevr00400("deleteEhsevr00400",mstGird_ds.getDeleted());
				}
				if (mstGird_ds.getUpdated().size() > 0) {
					Ehsevr00400_DAO.updateEhsevr00400("updateEhsevr00400",mstGird_ds.getUpdated());
				}
				if (mstGird_ds.getAdded().size() > 0) {
					for (Ehsevr00400 item : mstGird_ds.getAdded()) {
						cnt = mybatisSupport.selectOne(MyBatisUtil.getId(this.getClass(), "dao.Ehsevr00400_DAO.mstDupCheck"),item);
						if(cnt > 0){
							mResult.setSuccess(false);
							mResult.setMsg("중복된 데이터는 입력할 수 없습니다.");
							transaction.rollback();
							return mResult;
						}
					}
					Ehsevr00400_DAO.insertEhsevr00400("insertEhsevr00400",mstGird_ds.getAdded());
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

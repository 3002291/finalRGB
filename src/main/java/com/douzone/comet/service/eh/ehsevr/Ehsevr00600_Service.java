package com.douzone.comet.service.eh.ehsevr;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00600_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00600;
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
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@DzApiService(value="Ehsevr00600_Service", module=CometModule.EH, desc="기준정보관리 - 환경기준정보", version ="1.0.22110801")
public class Ehsevr00600_Service extends DzCometService {

	@Autowired
	Ehsevr00600_DAO Ehsevr00600_DAO; 

	@DzApi(url="/ehsevr00600_list", desc="수질분석항목등록-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00600> ehsevr00600_list(
		@DzParam(key="company_cd", desc="회사코드", paramType = DzParamType.QueryString) String company_cd,
		@DzParam(key="plant_cd", desc="공장코드", paramType = DzParamType.QueryString) String plant_cd,
		@DzParam(key="mersr_clas_nm", desc="측정항목명", paramType = DzParamType.QueryString) String mersr_clas_nm
	) throws Exception {
		List<Ehsevr00600> ehsevr00600List =  new ArrayList<Ehsevr00600>();
		try {
	 		HashMap<String, Object> parameters= new HashMap<>();
	 		parameters.put("P_COMPANY_CD", company_cd);
	 		parameters.put("P_PLANT_CD", plant_cd);
	 		parameters.put("P_MESR_CLAS_NM", mersr_clas_nm);
	 		ehsevr00600List = Ehsevr00600_DAO.selectList("selectList", parameters);
	 	} catch(Exception e) {
	         throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
	        			: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    return ehsevr00600List;
 	}
 	
 	@DzApi(url="/ehsevr00600_e0400Ddl", desc="수질분석항목등록-e0400드롭다운리스트-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00600> ehsevr00400_e0400Ddl(
			@DzParam(key="company_cd", desc="사업장", paramType=DzParamType.QueryString) String company_cd
			) throws Exception {
		List<Ehsevr00600> ehsevr00600List =  new ArrayList<Ehsevr00600>();
		try {
	 		HashMap<String, Object> parameters = new HashMap<String, Object>();
	 		parameters.put("P_COMPANY_CD", company_cd);
	 		ehsevr00600List = Ehsevr00600_DAO.selectList("ehsevr00600_e0400Ddl", parameters);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
	        			: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    return ehsevr00600List;
 	}
 	
 	@DzApi(url="/ehsevr00600_e0500Ddl", desc="수질분석항목등록-e0500드롭다운리스트-조회", httpMethod=DzRequestMethod.GET)
	public List<Ehsevr00600> ehsevr00400_e0500Ddl(
			@DzParam(key="company_cd", desc="사업장", paramType=DzParamType.QueryString) String company_cd
			) throws Exception {
		List<Ehsevr00600> ehsevr00600List =  new ArrayList<Ehsevr00600>();
		try {
	 		HashMap<String, Object> parameters = new HashMap<String, Object>();
	 		parameters.put("P_COMPANY_CD", company_cd);
	 		ehsevr00600List = Ehsevr00600_DAO.selectList("ehsevr00600_e0500Ddl", parameters);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
	        			: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    return ehsevr00600List;
 	}
 	
 	@DzApi(url = "/ehsevr00600_save", desc = "수질분석항목등록-저장", httpMethod = DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData ehsevr00400_save(
			@DzParam(key = "mstGird_ds", desc = "페수구분관등록리스트", paramType = DzParamType.Body) DzGridModel<Ehsevr00600> mstGird_ds
			) throws Exception {
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
		try {
			transaction = this.beginTransaction();
			Integer cnt = 0;
			
			if (mstGird_ds != null) {
				if (mstGird_ds.getDeleted().size() > 0) {
					Ehsevr00600_DAO.deleteEhsevr00600("deleteEhsevr00600", mstGird_ds.getDeleted());
				}
				if (mstGird_ds.getUpdated().size() > 0) {
					Ehsevr00600_DAO.updateEhsevr00600("updateEhsevr00600", mstGird_ds.getUpdated());
				}
				if (mstGird_ds.getAdded().size() > 0) {
					for (Ehsevr00600 item : mstGird_ds.getAdded()) {
						cnt = Ehsevr00600_DAO.selectOne("mstDupCheck",item);
						if(cnt > 0){
							mResult.setSuccess(false);
							mResult.setMsg("중복된 데이터는 입력할 수 없습니다.");
							transaction.rollback();
							return mResult;
						}
					}
					Ehsevr00600_DAO.insertEhsevr00600("insertEhsevr00600", mstGird_ds.getAdded());	
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

package com.douzone.comet.service.eh.ehsevr;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00700_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00700;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00700_Dropdown;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.jdbc.transaction.DbTransaction;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;
import com.douzone.gpd.restful.model.DzGridModel;

@DzApiService(value = "Ehsevr00700_Service", module = CometModule.EH, desc = "자동측정항목등록", version ="1.0.22110201")
public class Ehsevr00700_Service extends DzCometService {
	@Autowired
	Ehsevr00700_DAO ehsevr00700_DAO;
	
	@DzApi(url = "/ehsevr00700_list", desc = "자동측정항목등록 그리드 조회", httpMethod = DzRequestMethod.GET)
	public List<Ehsevr00700> ehsevr00700_list(
			@DzParam(key="company_cd", desc="회사코드", paramType=DzParamType.QueryString) String company_cd,
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="keyword", desc="검색어", paramType=DzParamType.QueryString) String keyword
			) throws Exception {
		List<Ehsevr00700> items = new ArrayList<Ehsevr00700>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("P_COMPANY_CD", company_cd);
			parameters.put("P_PLANT_CD", plant_cd);
			parameters.put("P_KEYWORD", keyword); 
			
			items = ehsevr00700_DAO.selectList("selectList", parameters);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
		return items;
	}
	
	@DzApi(url = "/ehsevr00700_dropdown", desc = "자동측정항목등록 드롭다운 조회", httpMethod = DzRequestMethod.GET)
	public List<Ehsevr00700_Dropdown> ehsevr00700_list(
			@DzParam(key="company_cd", desc="사업장", paramType=DzParamType.QueryString) String company_cd
			) throws Exception {
		List<Ehsevr00700_Dropdown> items = new ArrayList<Ehsevr00700_Dropdown>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("P_COMPANY_CD", company_cd);
			parameters.put("P_MCLS_CD", "E0600");
			
			items = ehsevr00700_DAO.selectDropdownList("selectDropdownList", parameters);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
		return items;
	}
	
	@DzApi(url = "/ehsevr00700_save", desc = "자동측정항목등록 저장", httpMethod = DzRequestMethod.POST)
	public void ehsevr00700_save(
			@DzParam(key = "ds_list", desc = "자동측정항목등록", paramType = DzParamType.Body) DzGridModel<Ehsevr00700> ds_list
			) throws Exception{
		DzGridModel<Ehsevr00700> ds_listTemp = ds_list;
		DbTransaction<?> trans = null;
		String error_point = null;
		try {
			trans = this.beginTransaction();
		
			if (ds_listTemp != null) {
				if (ds_listTemp.getDeleted().size() > 0) {
					for (Ehsevr00700 item : ds_listTemp.getDeleted()) {
						ehsevr00700_DAO.deleteEhsevr00700(item);
					}
				}
				if (ds_listTemp.getAdded().size() > 0) {
					for (Ehsevr00700 item : ds_listTemp.getAdded()) {
						item.setInsert_id(this.getUserId());
						item.setInsert_ip(this.getRemoteHost());
						error_point = item.getPlant_cd() + "|" + item.getMesr_clas_cd();
						
						ehsevr00700_DAO.insertEhsevr00700(item);
					}
				}
				if (ds_listTemp.getUpdated().size() > 0) {
					for (Ehsevr00700 item : ds_listTemp.getUpdated()) {
						item.setUpdate_id(this.getUserId());
						item.setUpdate_ip(this.getRemoteHost());
						error_point = item.getPlant_cd() + "|" + item.getMesr_clas_cd();

						ehsevr00700_DAO.updateEhsevr00700(item);
					}
				}
			}
			
			trans.commit();
		}
		catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			
			if("java.sql.SQLIntegrityConstraintViolationException".equals(e.getCause().getClass().getName())) {				
				SQLException sqle = (SQLException) e.getCause();
				
				//23000 무결성 위반 오류 
				throw new DzApplicationRuntimeException("23000".equals(sqle.getSQLState()) ? "PK오류" + error_point
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
					: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
	}

}

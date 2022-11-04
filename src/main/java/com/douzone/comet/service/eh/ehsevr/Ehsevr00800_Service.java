package com.douzone.comet.service.eh.ehsevr;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00800_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00800;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00800_Dropdown;
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
 * @description : 약품원료등록
 * @Since   : 2022.11.02
 * @Author  : 강아름
 */

@DzApiService(value = "Ehsevr00800_Service", module = CometModule.EH, desc = "약품원료등록", version ="1.0.22110401")
public class Ehsevr00800_Service extends DzCometService {
	@Autowired
	Ehsevr00800_DAO ehsevr00800_DAO;
	
	@DzApi(url = "/ehsevr00800_list", desc = "약품원료등록 그리드 조회", httpMethod = DzRequestMethod.GET)
	public List<Ehsevr00800> ehsevr00800_list(
			@DzParam(key="company_cd", desc="회사코드", paramType=DzParamType.QueryString) String company_cd,
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="keyword", desc="검색어", paramType=DzParamType.QueryString) String keyword
			) throws Exception {
		List<Ehsevr00800> items = new ArrayList<Ehsevr00800>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("P_COMPANY_CD", company_cd);
			parameters.put("P_PLANT_CD", plant_cd);
			parameters.put("P_KEYWORD", keyword); 
			
			items = ehsevr00800_DAO.selectList("selectList", parameters);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
		return items;
	}
	
	@DzApi(url = "/ehsevr00800_dropdown", desc = "약품원료등록 드롭다운 조회", httpMethod = DzRequestMethod.GET)
	public List<Ehsevr00800_Dropdown> ehsevr00800_list(
			@DzParam(key="company_cd", desc="사업장", paramType=DzParamType.QueryString) String company_cd,
			@DzParam(key="mcls_cd", desc="관리항목코드", paramType=DzParamType.QueryString) String mcls_cd
			) throws Exception {
		List<Ehsevr00800_Dropdown> items = new ArrayList<Ehsevr00800_Dropdown>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("P_COMPANY_CD", company_cd);
			parameters.put("P_MCLS_CD", mcls_cd);
			
			items = ehsevr00800_DAO.selectDropdownList("selectDropdownList", parameters);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
		return items;
	}
	
	@DzApi(url = "/ehsevr00800_save", desc = "약품원료등록 저장", httpMethod = DzRequestMethod.POST)
	public void ehsevr00800_save(
			@DzParam(key = "ds_list", desc = "약품원료등록", paramType = DzParamType.Body) DzGridModel<Ehsevr00800> ds_list
			) throws Exception{
		DzGridModel<Ehsevr00800> ds_listTemp = ds_list;
		DbTransaction<?> trans = null;
		String error_point = null;
		try {
			trans = this.beginTransaction();
		
			if (ds_listTemp != null) {
				if (ds_listTemp.getDeleted().size() > 0) {
					for (Ehsevr00800 item : ds_listTemp.getDeleted()) {
						ehsevr00800_DAO.deleteEhsevr00800(item);
					}
				}
				if (ds_listTemp.getAdded().size() > 0) {
					for (Ehsevr00800 item : ds_listTemp.getAdded()) {
						item.setInsert_id(this.getUserId());
						item.setInsert_ip(this.getRemoteHost());
						error_point = item.getPlant_cd() + "|" + item.getEnv_tsk_fg_cd() + "|" + item.getFg_cd() + "|" + item.getCmcl_cd();
						
						ehsevr00800_DAO.insertEhsevr00800(item);
					}
				}
				if (ds_listTemp.getUpdated().size() > 0) {
					for (Ehsevr00800 item : ds_listTemp.getUpdated()) {
						item.setUpdate_id(this.getUserId());
						item.setUpdate_ip(this.getRemoteHost());
						error_point = item.getPlant_cd() + "|" + item.getEnv_tsk_fg_cd() + "|" + item.getFg_cd() + "|" + item.getCmcl_cd();

						ehsevr00800_DAO.updateEhsevr00800(item);
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

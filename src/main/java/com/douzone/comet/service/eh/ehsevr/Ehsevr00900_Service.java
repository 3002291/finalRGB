package com.douzone.comet.service.eh.ehsevr;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00900_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00900;
import com.douzone.comet.service.util.api.models.scm.SCMApiProvider_Ps_ResultData;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.jdbc.transaction.DbTransaction;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;
import com.douzone.gpd.restful.model.DzGridModel;

@DzApiService(value = "Ehsevr00900_Service", module = CometModule.EH, desc = "폭기조구분등록", version ="1.0.22102601")
public class Ehsevr00900_Service extends DzCometService {
	@Autowired
	Ehsevr00900_DAO ehsevr00900_DAO;
	
//	@Autowired
//	EH_WRKRISKCHK_MST_Dao eh_wrkriskchk_mst_Dao;
	
	@DzApi(url = "/ehsevr00900_list", desc = "폭기조구분등록 그리드 조회", httpMethod = DzRequestMethod.GET)
	public List<Ehsevr00900> ehsevr00900_list(
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="keyword", desc="검색어", paramType=DzParamType.QueryString) String keyword
			) throws Exception {
		List<Ehsevr00900> items = new ArrayList<Ehsevr00900>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("P_COMPANY_CD", this.getCompanyCode());
			parameters.put("P_PLANT_CD", plant_cd);
			parameters.put("P_KEYWORD", keyword); // 검색어: 시설코드(FACI_CD),시설명(FACI_DC)
			
			items = ehsevr00900_DAO.selectList("selectList", parameters);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
		return items;
	}
	
	@Transactional(rollbackFor = Exception.class)
	@DzApi(url = "/ehsevr00900_save", desc = "폭기조구분등록 저장", httpMethod = DzRequestMethod.POST)
	public void ehsevr00900_save(
			@DzParam(key = "ds_list", desc = "폭기조구분등록", paramType = DzParamType.Body) DzGridModel<Ehsevr00900> ds_list
			) throws Exception {
		DzGridModel<Ehsevr00900> ds_listTemp = ds_list;
		
		try {
			if (ds_listTemp != null) {
				if (ds_listTemp.getDeleted().size() > 0) {
					for (Ehsevr00900 item : ds_listTemp.getDeleted()) {
						item.setCompany_cd(this.getCompanyCode());

						ehsevr00900_DAO.deleteEhsevr00900(item);
					}
				}
				if (ds_listTemp.getAdded().size() > 0) {
					for (Ehsevr00900 item : ds_listTemp.getAdded()) {
						item.setCompany_cd(this.getCompanyCode());
						item.setInsert_id(this.getUserId());
						item.setInsert_ip(this.getRemoteHost());
//						item.setSale_dt(StringUtil.getLocaleTimeString(item.getSale_dt(), "yyyyMMdd"));
						
						ehsevr00900_DAO.insertEhsevr00900(item);
					}
				}
				if (ds_listTemp.getUpdated().size() > 0) {
					for (Ehsevr00900 item : ds_listTemp.getUpdated()) {
						item.setCompany_cd(this.getCompanyCode());
						item.setUpdate_id(this.getUserId());
						item.setUpdate_ip(this.getRemoteHost());
//						item.setSale_dt(StringUtil.getLocaleTimeString(item.getSale_dt(), "yyyyMMdd"));

						ehsevr00900_DAO.updateEhsevr00900(item);
					}
				}
			}
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e);
		}
	}

}

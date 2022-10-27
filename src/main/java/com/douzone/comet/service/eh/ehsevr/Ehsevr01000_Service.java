package com.douzone.comet.service.eh.ehsevr;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.ehsevr.dao.Ehsevr01000_DAO;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr01000;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;
import com.douzone.gpd.restful.model.DzGridModel;

@DzApiService(value = "Ehsevr01000_Service", module = CometModule.EH, desc = "폭기조항목등록", version ="1.0.22102701")
public class Ehsevr01000_Service extends DzCometService {
	@Autowired
	Ehsevr01000_DAO ehsevr01000_DAO;
	
	@DzApi(url = "/ehsevr01000_list", desc = "폭기조항목등록 그리드 조회", httpMethod = DzRequestMethod.GET)
	public List<Ehsevr01000> ehsevr01000_list(
			@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
			@DzParam(key="keyword", desc="검색어", paramType=DzParamType.QueryString) String keyword
			) throws Exception {
		List<Ehsevr01000> items = new ArrayList<Ehsevr01000>();
		try {
			HashMap<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("P_COMPANY_CD", this.getCompanyCode());
			parameters.put("P_PLANT_CD", plant_cd);
			parameters.put("P_KEYWORD", keyword); // 검색어: 측정항목코드(MESR_CLAS_CD),측정항목명(MESR_CLAS_NM)
			
			items = ehsevr01000_DAO.selectList("selectList", parameters);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		}
		return items;
	}
	
	@Transactional(rollbackFor = Exception.class)
	@DzApi(url = "/ehsevr01000_save", desc = "폭기조항목등록 저장", httpMethod = DzRequestMethod.POST)
	public void ehsevr01000_save(
			@DzParam(key = "ds_list", desc = "폭기조항목등록", paramType = DzParamType.Body) DzGridModel<Ehsevr01000> ds_list
			) throws Exception {
		DzGridModel<Ehsevr01000> ds_listTemp = ds_list;
		
		try {
			if (ds_listTemp != null) {
				if (ds_listTemp.getDeleted().size() > 0) {
					for (Ehsevr01000 item : ds_listTemp.getDeleted()) {
						item.setCompany_cd(this.getCompanyCode());

						ehsevr01000_DAO.deleteEhsevr01000(item);
					}
				}
				if (ds_listTemp.getAdded().size() > 0) {
					for (Ehsevr01000 item : ds_listTemp.getAdded()) {
						item.setCompany_cd(this.getCompanyCode());
						item.setInsert_id(this.getUserId());
						item.setInsert_ip(this.getRemoteHost());
//						item.setSale_dt(StringUtil.getLocaleTimeString(item.getSale_dt(), "yyyyMMdd"));
						
						ehsevr01000_DAO.insertEhsevr01000(item);
					}
				}
				if (ds_listTemp.getUpdated().size() > 0) {
					for (Ehsevr01000 item : ds_listTemp.getUpdated()) {
						item.setCompany_cd(this.getCompanyCode());
						item.setUpdate_id(this.getUserId());
						item.setUpdate_ip(this.getRemoteHost());
//						item.setSale_dt(StringUtil.getLocaleTimeString(item.getSale_dt(), "yyyyMMdd"));

						ehsevr01000_DAO.updateEhsevr01000(item);
					}
				}
			}
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e);
		}
	}

}

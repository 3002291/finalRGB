package com.douzone.comet.service.eh.evrwaq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.evrwaq.dao.Evrwaq00100_DAO;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_DSC;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_Drop;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_MASTER;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_PRV;
import com.douzone.comet.service.util.DateUtil;
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

@DzApiService(value = "Evrwaq00100_Service", module = CometModule.EH, desc = "폐수방지시설운영일지등록", version = "1.0.0")
public class Evrwaq00100_Service extends DzCometService {
	
	@Autowired
	Evrwaq00100_DAO evrwaq00100_DAO;
	
		// 폐수방지시설운영마스터(마스터 그리드) 조회
		@DzApi(url = "/evrwaq00100_MASTERlist", desc = "폐수방지시설마스터조회", httpMethod = DzRequestMethod.GET)
		public List<Evrwaq00100_MASTER> evrwaq00100_MASTER_list(
				@DzParam(key = "plant_cd", desc = "공장코드", paramType = DzParamType.QueryString) String plant_cd,
				@DzParam(key = "oper_drpt_insert_start_dt", desc = "운영일지등록일-시작", paramType = DzParamType.QueryString) String oper_drpt_insert_start_dt,
				@DzParam(key = "oper_drpt_insert_end_dt", desc = "운영일지등록일-끝", paramType = DzParamType.QueryString) String oper_drpt_insert_end_dt,
				@DzParam(key = "athz_st_cd", desc = "결재상태코드", paramType = DzParamType.QueryString) String athz_st_cd)
				throws Exception {
			List<Evrwaq00100_MASTER> items = null;
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_OPER_DRPT_INSERT_START_DT", oper_drpt_insert_start_dt);
				parameters.put("P_OPER_DRPT_INSERT_END_DT", oper_drpt_insert_end_dt);
				parameters.put("P_ATHZ_ST_CD", athz_st_cd);
				
				items = evrwaq00100_DAO.evrwaq00100_MASTER_list("MASTERlist", parameters);
				
			} catch (Exception e) {
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0
						? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return items;
		}
		// 날씨 조회(드롭다운리스트)
		@DzApi(url = "/evrwaq00100_Drop", desc = "폐수방지시설-날씨드롭", httpMethod = DzRequestMethod.GET)
		public List<Evrwaq00100_Drop> evrwaq00100_Drop_list() throws Exception {
			List<Evrwaq00100_Drop> items = null;
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				
				items = evrwaq00100_DAO.evrwaq00100_Drop_list("Droplist", parameters);
			} catch (Exception e) {
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0
						? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return items;
		}
		// 배출시설가동시간(디테일 그리드) 조회
		@DzApi(url="/Evrwaq00100_DSClist", desc="배출시설가동정보-조회", httpMethod=DzRequestMethod.GET)
		public List<Evrwaq00100_DSC> Evrwaq00100_D_list(
				@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
				@DzParam(key="doc_no", desc="문서번호", paramType=DzParamType.QueryString) String doc_no) throws Exception {
			List<Evrwaq00100_DSC> list =  new ArrayList<Evrwaq00100_DSC>();
			
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_DOC_NO", doc_no);
				
				list = evrwaq00100_DAO.evrwaq00100_DSC_list("DSClist", parameters);
		 	} catch(Exception e) {
		 		throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
					: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		    }
		    return list;
	 	}	
		// 방지시설가동시간(디테일 그리드) 조회
		@DzApi(url="/Evrwaq00100_PRVlist", desc="방지시설가동정보-조회", httpMethod=DzRequestMethod.GET)
		public List<Evrwaq00100_PRV> Evrwaq00100_P_list(
				@DzParam(key="plant_cd", desc="사업장", paramType=DzParamType.QueryString) String plant_cd,
				@DzParam(key="doc_no", desc="문서번호", paramType=DzParamType.QueryString) String doc_no) throws Exception {
			
			List<Evrwaq00100_PRV> list =  new ArrayList<Evrwaq00100_PRV>();
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_DOC_NO", doc_no);
				
				list = evrwaq00100_DAO.evrwaq00100_PRV_list("PRVlist", parameters);
		 	} catch(Exception e) {
		 		throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
					: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
		    }
		    return list;
	 	}
		// 문서번호 중복체크
		@DzApi(url = "/evrwaq00100_doccheck", desc = "업무문서중복체크", httpMethod = DzRequestMethod.GET)
		public SCMApiProvider_Ps_ResultData evrwaq00100_check(
				@DzParam(key = "doc_no", desc = "문서번호", paramType = DzParamType.QueryString) String doc_no) throws Exception {
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			int count = 0;
			try {
					HashMap<String, Object> parameters = new HashMap<String, Object>();
					parameters.put("P_DOC_NO", doc_no);
					
					count = evrwaq00100_DAO.evrwaq00100_doc_check("doccheck", parameters);
				if(count > 0) {
					mResult.setMsg("동일한 문서번호가 존재합니다.");
					mResult.setSuccess(false);
					return mResult;
				}
			} catch (Exception e) {
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0
						? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			mResult.setSuccess(true);
			return mResult;
		}
		@DzApi(url = "/evrwaq00100_existData", desc = "디테일그리드데이터존재여부확인", httpMethod = DzRequestMethod.GET)
		public int evrwaq00100_existData(
				@DzParam(key = "company_cd", desc = "회사코드", paramType = DzParamType.QueryString) String company_cd,
				@DzParam(key = "plant_cd", desc = "공장코드", paramType = DzParamType.QueryString) String plant_cd,
				@DzParam(key = "doc_no", desc = "문서번호", paramType = DzParamType.QueryString) String doc_no) throws Exception {
			int cntDSC = 0;
			int cntPRV = 0;
			int total = 0;
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", company_cd);
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_DOC_NO", doc_no);
				
				cntDSC = evrwaq00100_DAO.evrwaq00100_existDSC("existDSC", parameters);
				cntPRV = evrwaq00100_DAO.evrwaq00100_existPRV("existPRV", parameters);
				total = cntDSC + cntPRV;
			} catch (Exception e) {
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0
						? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return total;
		}
		//저장
		@DzApi(url = "/Evrwaq00100_save", desc = "폐수방지시설운영일지-저장", httpMethod = DzRequestMethod.POST)
		public SCMApiProvider_Ps_ResultData Evrwaq00100_save(
				@DzParam(key = "MASTER", desc = "마스터 그리드 데이터소스", paramType = DzParamType.Body) DzGridModel<Evrwaq00100_MASTER> MASTER,
				@DzParam(key = "DSC", desc = "배출시설 그리드 데이터소스", paramType = DzParamType.Body) DzGridModel<Evrwaq00100_DSC> DSC,
				@DzParam(key = "PRV", desc = "방지시설 그리드 데이터소스", paramType = DzParamType.Body) DzGridModel<Evrwaq00100_PRV> PRV
				) throws Exception {
			DbTransaction<?> transaction = null;
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			try {
				transaction = this.beginTransaction();
				// 마스터
				if(MASTER != null) {
					for (Evrwaq00100_MASTER item : MASTER.getDeleted()) {
						evrwaq00100_MST_delete(item);
					}
					for (Evrwaq00100_MASTER item : MASTER.getUpdated()) {
						evrwaq00100_MST_update(item);
					}
					
					for (Evrwaq00100_MASTER item : MASTER.getAdded()) {
						mResult = evrwaq00100_MST_insert(item);
						if (mResult.getSuccess() == false) {
							transaction.rollback();
							return mResult;
						}
					}
				}
				// 배출시설
				if(DSC != null) {
					for (Evrwaq00100_DSC item : DSC.getDeleted()) {
						Evrwaq00100_DSC_delete(item);
					}
					for (Evrwaq00100_DSC item : DSC.getUpdated()) {
						mResult = Evrwaq00100_DSC_update(item);
						if(mResult.getSuccess() == false) {
						if(transaction != null) {
							transaction.rollback();
						}
						return mResult;
						}
					}
					for (Evrwaq00100_DSC item : DSC.getAdded()) {
						mResult = Evrwaq00100_DSC_insert(item);
						if (mResult.getSuccess() == false) {
							transaction.rollback();
							return mResult;
						}
					}
				}
				// 방지시설
				if(PRV != null) {
					for (Evrwaq00100_PRV item : PRV.getDeleted()) {
						Evrwaq00100_PRV_delete(item);
					}
					for (Evrwaq00100_PRV item : PRV.getUpdated()) {
						mResult = Evrwaq00100_PRV_update(item);
						if(mResult.getSuccess() == false) {
							if(transaction != null) {
								transaction.rollback();
							}
							return mResult;
						}
					}
					for (Evrwaq00100_PRV item : PRV.getAdded()) {
						mResult = Evrwaq00100_PRV_insert(item);
						if (mResult.getSuccess() == false) {
							transaction.rollback();
							return mResult;
						}
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
		// MASTER 삽입
		private SCMApiProvider_Ps_ResultData evrwaq00100_MST_insert(Evrwaq00100_MASTER MASTER) throws Exception {
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			int count = 0;
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", MASTER.getPlant_cd());
				parameters.put("P_DOC_NO", MASTER.getDoc_no());
				parameters.put("P_OPER_DRPT_INSERT_DT", DateUtil.ParseDateString((String) MASTER.getOper_drpt_insert_dt()));
				parameters.put("P_WTHR_FG", MASTER.getWthr_fg());
				parameters.put("P_DRV_TMPT", MASTER.getDrv_tmpt());
				parameters.put("P_EQP_CD", MASTER.getEqp_cd());
				parameters.put("P_EQP_NM", MASTER.getEqp_nm());
				parameters.put("P_WRTR_ID", MASTER.getWrtr_id());
				parameters.put("P_ATHZ_ST_CD", MASTER.getAthz_st_cd());
				
				count = evrwaq00100_DAO.evrwaq00100_doc_check("doccheck", parameters);
				
				if(count > 0) {
					mResult.setMsg("해당 문서번호가 이미 존재합니다.");
					mResult.setSuccess(false);
					return mResult;
				}
				evrwaq00100_DAO.evrwaq00100_MST_insert("MSTinsert", parameters);
			} catch (Exception e) {
				throw e;
			}
			mResult.setSuccess(true);
			return mResult;
		}
		// MASTER 수정
		private void evrwaq00100_MST_update(Evrwaq00100_MASTER MASTER) throws Exception {
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", MASTER.getPlant_cd());
				parameters.put("P_DOC_NO", MASTER.getDoc_no());
				parameters.put("P_OPER_DRPT_INSERT_DT", DateUtil.ParseDateString((String) MASTER.getOper_drpt_insert_dt()));
				parameters.put("P_WTHR_FG", MASTER.getWthr_fg());
				parameters.put("P_DRV_TMPT", MASTER.getDrv_tmpt());
				
				evrwaq00100_DAO.evrwaq00100_MST_update("MSTupdate", parameters);
			} catch (Exception e) {
				throw e;
			}
		}
		// MASTER 삭제
		private void evrwaq00100_MST_delete(Evrwaq00100_MASTER MASTER) throws Exception {
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", MASTER.getPlant_cd());
				parameters.put("P_DOC_NO", MASTER.getDoc_no());
				parameters.put("P_OPER_DRPT_INSERT_DT", DateUtil.ParseDateString((String) MASTER.getOper_drpt_insert_dt()));
				
				evrwaq00100_DAO.evrwaq00100_MST_delete("MSTdelete", parameters);
			} catch (Exception e) {
				throw e;
			}
		}
		// DSC(배출시설) 삽입
		private SCMApiProvider_Ps_ResultData Evrwaq00100_DSC_insert(Evrwaq00100_DSC DSC) throws Exception {
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			try {
				List<Evrwaq00100_DSC> items = null;
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("company_cd", this.getCompanyCode());
				parameters.put("P_PLANT_CD", DSC.getPlant_cd());
				parameters.put("doc_no", DSC.getDoc_no());
				parameters.put("dschfclt_cd", DSC.getDschfclt_cd());
				parameters.put("dschfclt_nm", DSC.getDschfclt_nm());
				parameters.put("start_tm", DSC.getStart_tm());
				parameters.put("end_tm", DSC.getEnd_tm());
				parameters.put("oprn_tm", DSC.getOprn_tm());
				parameters.put("specail_dc", DSC.getSpecail_dc());
				
				items = evrwaq00100_DAO.evrwaq00100_DSC_dupcheck("DSCdupcheck", parameters);
				
				if(items != null && items.size() > 0){ //중복체크 걸린 경우
					mResult.setMsg("동일한 배출시설코드(" + items + ")가 이미 존재합니다.");
					mResult.setSuccess(false);
					return mResult;
				}
				evrwaq00100_DAO.evrwaq00100_DSC_insert("DSCinsert", parameters);
			}
			catch (Exception e) {
				throw e;
			}
			mResult.setSuccess(true);
			return mResult;
		}
		// DSC(배출시설) 수정
		private SCMApiProvider_Ps_ResultData Evrwaq00100_DSC_update(Evrwaq00100_DSC DSC) throws Exception {
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			
			try {
				List<Evrwaq00100_DSC> items = null;
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", DSC.getPlant_cd());
				parameters.put("P_DOC_NO", DSC.getDoc_no());
				parameters.put("P_DSCHFCLT_CD", DSC.getDschfclt_cd());
				parameters.put("P_DSCHFCLT_NM", DSC.getDschfclt_nm());
				parameters.put("P_START_TM", DSC.getStart_tm());
				parameters.put("P_END_TM", DSC.getEnd_tm());
				parameters.put("P_OPRN_TM", DSC.getOprn_tm());
				parameters.put("P_SPECAIL_DC", DSC.getSpecail_dc());
				parameters.put("P_Before_DSCHFCLT_CD", DSC.getBefore_dschfclt_cd());
							
				items = evrwaq00100_DAO.evrwaq00100_DSC_updatecheck("DSCupdatecheck", parameters);
				
				if(items != null && items.size() > 0) {
					mResult.setMsg("배출시설가동시간에 동일 데이터가 존재합니다. 확인 후 다시 입력해주세요.");
					mResult.setSuccess(false);
					return mResult;
				}
				if(DSC.getBefore_dschfclt_cd() == null) {
					mResult.setMsg("배출시설코드 변경이 잘못되었습니다.");
					mResult.setSuccess(false);
					return mResult;
				}
				evrwaq00100_DAO.evrwaq00100_DSC_update("DSCupdate", parameters);
			} catch (Exception e) {
				throw new DzApplicationRuntimeException(e);
			}
			mResult.setSuccess(true);
			return mResult;	
		}
		// DSC(배출시설) 삭제
		private void Evrwaq00100_DSC_delete(Evrwaq00100_DSC DSC) throws Exception {
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("company_cd", this.getCompanyCode());
				parameters.put("plant_cd", DSC.getPlant_cd());
				parameters.put("doc_no", DSC.getDoc_no());
				parameters.put("dschfclt_cd", DSC.getDschfclt_cd());
				
				evrwaq00100_DAO.evrwaq00100_DSC_delete("DSCdelete", parameters);
			} catch (Exception e) {
				throw e;
			}
		}
		// PRV(방지시설) 삽입
		private SCMApiProvider_Ps_ResultData Evrwaq00100_PRV_insert(Evrwaq00100_PRV PRV) throws Exception {
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			try {
				List<Evrwaq00100_PRV> items = null;
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("company_cd", this.getCompanyCode());
				parameters.put("plant_cd", PRV.getPlant_cd());
				parameters.put("doc_no", PRV.getDoc_no());
				parameters.put("prvnfclt_cd", PRV.getPrvnfclt_cd());
				parameters.put("prvnfclt_nm", PRV.getPrvnfclt_nm());
				parameters.put("start_tm", PRV.getStart_tm());
				parameters.put("end_tm", PRV.getEnd_tm());
				parameters.put("oprn_tm", PRV.getOprn_tm());
				parameters.put("nshift_bwrk_man_nm", PRV.getNshift_bwrk_man_nm());
				parameters.put("dshift_bwrk_man_nm", PRV.getDshift_bwrk_man_nm());
				parameters.put("ashift_bwrk_man_nm", PRV.getAshift_bwrk_man_nm());
				parameters.put("rmk_dc", PRV.getRmk_dc());
				
				items = evrwaq00100_DAO.evrwaq00100_PRV_dupcheck("PRVdupcheck", parameters);
				
				if(items != null && items.size() > 0){ //중복체크 걸린 경우
					mResult.setMsg("동일한 방지시설코드가 이미 존재합니다.");
					mResult.setSuccess(false);
					return mResult;
				}
				evrwaq00100_DAO.evrwaq00100_PRV_insert("PRVinsert", parameters);
			}
			catch (Exception e) {
				throw e;
			}
			mResult.setSuccess(true);
			return mResult;
		}
		// PRV(방지시설) 수정
		private SCMApiProvider_Ps_ResultData Evrwaq00100_PRV_update(Evrwaq00100_PRV PRV) throws Exception {
			SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
			try {
				List<Evrwaq00100_PRV> items = null;
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", PRV.getPlant_cd());
				parameters.put("P_DOC_NO", PRV.getDoc_no());
				parameters.put("P_PRVNFCLT_CD", PRV.getPrvnfclt_cd());
				parameters.put("P_PRVNFCLT_NM", PRV.getPrvnfclt_nm());
				parameters.put("P_START_TM", PRV.getStart_tm());
				parameters.put("P_END_TM", PRV.getEnd_tm());
				parameters.put("P_OPRN_TM", PRV.getOprn_tm());
				parameters.put("P_NSHIFT_BWRK_MAN_NM", PRV.getNshift_bwrk_man_nm());
				parameters.put("P_DSHIFT_BWRK_MAN_NM", PRV.getDshift_bwrk_man_nm());
				parameters.put("P_ASHIFT_BWRK_MAN_NM", PRV.getAshift_bwrk_man_nm());
				parameters.put("P_RMK_DC", PRV.getRmk_dc());
				parameters.put("P_Before_PRVNFCLT_CD", PRV.getBefore_prvnfclt_cd());

				items = evrwaq00100_DAO.evrwaq00100_PRV_updatecheck("PRVupdatecheck", parameters);
				
				if(items != null && items.size() > 0) {
					mResult.setMsg("방지시설가동시간에 동일 데이터가 존재합니다. 확인 후 다시 입력해주세요.");
					mResult.setSuccess(false);
					return mResult;
				} // update 과정에서 PK 변경을 한다면 비교 확인
				
				if(PRV.getBefore_prvnfclt_cd() == null) {
					mResult.setMsg("방지시설코드 변경이 잘못되었습니다.");
					mResult.setSuccess(false);
					return mResult;
				}
				evrwaq00100_DAO.evrwaq00100_PRV_update("PRVupdate", parameters);			
				
			} catch (Exception e) {
				throw new DzApplicationRuntimeException(e);
			}
			mResult.setSuccess(true);
			return mResult;	
		} 
		// PRV(방지시설) 삭제
		private void Evrwaq00100_PRV_delete(Evrwaq00100_PRV PRV) throws Exception {
			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				
				parameters.put("company_cd", this.getCompanyCode());
				parameters.put("plant_cd", PRV.getPlant_cd());
				parameters.put("doc_no", PRV.getDoc_no());
				parameters.put("prvnfclt_cd", PRV.getPrvnfclt_cd());
				
				evrwaq00100_DAO.evrwaq00100_PRV_delete("PRVdelete", parameters);
			} catch (Exception e) {
				throw e;
			}
		}
		// DSC(배출시설) 시설코드 팝업도움창 조회
		@DzApi(url = "/evrwaq00100_DSCpop_list", desc = "배출시설등록-팝업_sm.ver", httpMethod = DzRequestMethod.GET)
		public List<Evrwaq00100_DSC> ehsevr00200_list_pop(
				@DzParam(key = "plant_cd", desc = "사업장", paramType = DzParamType.QueryString) String plant_cd,
				@DzParam(key = "text_keyword", desc = "키워드검색", paramType = DzParamType.QueryString) String text_keyword) throws Exception {

			List<Evrwaq00100_DSC> EH_items = null;

			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_TEXT_KEYWORD", text_keyword);
				
				EH_items = evrwaq00100_DAO.evrwaq00100_DSCpop_list("DSCpoplist", parameters);


			} catch (Exception e) {
				e.printStackTrace();
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return EH_items;
		}
		// DSC(배출시설) 시설코드 팝업도움창 데이터중복체크
		@DzApi(url = "/evrwaq00100_DSCpop_check", desc = "배출시설등록-팝업데이터중복체크_sm.ver", httpMethod = DzRequestMethod.GET)
		public List<Evrwaq00100_DSC> ehsevr00200_Check_POP(
				@DzParam(key = "plant_cd", desc = "사업장코드", paramType = DzParamType.QueryString) String plant_cd,
				@DzParam(key = "dschfclt_cd", desc = "배출시설코드", paramType = DzParamType.QueryString) String dschfclt_cd,
				@DzParam(key = "doc_no", desc = "문서번호", paramType = DzParamType.QueryString) String doc_no) throws Exception {

			List<Evrwaq00100_DSC> EH_items = null;

			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_DSCHFCLT_CD", dschfclt_cd);
				parameters.put("P_DOC_NO", doc_no);

				EH_items = evrwaq00100_DAO.evrwaq00100_DSCpop_check("DSCpopcheck", parameters);
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return EH_items;
		}
		// PRV(방지시설) 시설코드 팝업도움창 조회
		@DzApi(url = "/evrwaq00100_PRVpop_list", desc = "방지시설등록-팝업_sm.ver", httpMethod = DzRequestMethod.GET)
		public List<Evrwaq00100_PRV> ehsevr00100_list_pop(
				@DzParam(key = "plant_cd", desc = "사업장", paramType = DzParamType.QueryString) String plant_cd,
				@DzParam(key = "text_keyword", desc = "키워드검색", paramType = DzParamType.QueryString) String text_keyword) throws Exception {

			List<Evrwaq00100_PRV> EH_items = null;

			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_TEXT_KEYWORD", text_keyword);
				
				EH_items = evrwaq00100_DAO.evrwaq00100_PRVpop_list("PRVpoplist", parameters);


			} catch (Exception e) {
				e.printStackTrace();
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return EH_items;
		}
		// DSC(배출시설) 시설코드 팝업도움창 데이터중복체크
		@DzApi(url = "/evrwaq00100_PRVpop_check", desc = "방지시설등록-팝업데이터중복체크_sm.ver", httpMethod = DzRequestMethod.GET)
		public List<Evrwaq00100_PRV> ehsevr00100_Check_POP(
				@DzParam(key = "plant_cd", desc = "사업장코드", paramType = DzParamType.QueryString) String plant_cd,
				@DzParam(key = "prvnfclt_cd", desc = "배출시설코드", paramType = DzParamType.QueryString) String prvnfclt_cd,
				@DzParam(key = "doc_no", desc = "문서번호", paramType = DzParamType.QueryString) String doc_no) throws Exception {

			List<Evrwaq00100_PRV> EH_items = null;

			try {
				HashMap<String, Object> parameters = new HashMap<String, Object>();
				parameters.put("P_COMPANY_CD", this.getCompanyCode());
				parameters.put("P_PLANT_CD", plant_cd);
				parameters.put("P_PRVNFCLT_CD", prvnfclt_cd);
				parameters.put("P_DOC_NO", doc_no);

				EH_items = evrwaq00100_DAO.evrwaq00100_PRVpop_check("PRVpopcheck", parameters);
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
						: (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
			}
			return EH_items;
		}
}

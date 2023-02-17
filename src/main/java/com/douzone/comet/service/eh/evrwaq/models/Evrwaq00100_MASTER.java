package com.douzone.comet.service.eh.evrwaq.models;

import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;

@DzModel(name = "evrwaq00100_MASTER", desc = "폐수방지시설운영-마스터")
public class Evrwaq00100_MASTER {
	
	@SerializedName("COMPANY_CD")
	@DzModelField(name = "COMPANY_CD", desc = "회사코드", colName = "COMPANY_CD")
	private String company_cd;
	
	@SerializedName("PLANT_CD")
	@DzModelField(name = "PLANT_CD", desc = "공장코드", colName = "PLANT_CD")
	private String plant_cd;
	
	@SerializedName("DOC_NO")
	@DzModelField(name = "DOC_NO", desc = "문서번호", colName = "DOC_NO")
	private String doc_no;
	
	@SerializedName("OPER_DRPT_INSERT_DT")
	@DzModelField(name = "OPER_DRPT_INSERT_DT", desc = "운영일자등록일", colName = "OPER_DRPT_INSERT_DT")
	private String oper_drpt_insert_dt;
	
	@SerializedName("WTHR_FG")
	@DzModelField(name = "WTHR_FG", desc = "날씨구분", colName = "WTHR_FG")
	private String wthr_fg;
	
	@SerializedName("DRV_TMPT")
	@DzModelField(name = "DRV_TMPT", desc = "운전온도", colName = "DRV_TMPT")
	private String drv_tmpt;
	
	@SerializedName("EQP_CD")
	@DzModelField(name = "EQP_CD", desc = "설비코드", colName = "EQP_CD")
	private String eqp_cd;
	
	@SerializedName("EQP_NM")
	@DzModelField(name = "EQP_NM", desc = "설비명", colName = "EQP_NM")
	private String eqp_nm;
	
	@SerializedName("WRTR_ID")
	@DzModelField(name = "WRTR_ID", desc = "작성자ID", colName = "WRTR_ID")
	private String wrtr_id;
	
	@SerializedName("ATHZ_ST_CD")
	@DzModelField(name = "ATHZ_ST_CD", desc = "결재상태코드", colName = "ATHZ_ST_CD")
	private String athz_st_cd;
	
	@SerializedName("INSERT_ID")
	@DzModelField(name = "INSERT_ID", desc = "등록ID", colName = "INSERT_ID")
	private String insert_id;
	
	@SerializedName("INSERT_IP")
	@DzModelField(name = "INSERT_IP", desc = "등록IP", colName = "INSERT_IP")
	private String insert_ip;
	
	@SerializedName("INSERT_MCADDR_NM")
	@DzModelField(name = "INSERT_MCADDR_NM", desc = "등록맥어드레스", colName = "INSERT_MCADDR_NM")
	private String insert_mcaddr_nm;
	
	@SerializedName("INSERT_DTS")
	@DzModelField(name = "INSERT_DTS", desc = "등록일시", colName = "INSERT_DTS")
	private String insert_dts;
	
	@SerializedName("UPDATE_ID")
	@DzModelField(name = "UPDATE_ID", desc = "수정ID", colName = "UPDATE_ID")
	private String update_id;
	
	@SerializedName("UPDATE_IP")
	@DzModelField(name = "UPDATE_IP", desc = "수정IP", colName = "UPDATE_IP")
	private String update_ip;
	
	@SerializedName("UPDATE_MCADDR_NM")
	@DzModelField(name = "UPDATE_MCADDR_NM", desc = "수정맥어드레스", colName = "UPDATE_MCADDR_NM")
	private String update_mcaddr_nm;
	
	@SerializedName("UPDATE_DTS")
	@DzModelField(name = "UPDATE_DTS", desc = "수정일시", colName = "UPDATE_DTS")
	private String update_dts;
	
	@SerializedName("PLANT_NM")
	@DzModelField(name = "PLANT_NM", desc = "공장명", colName = "PLANT_NM")
	private String plant_nm;

	public String getCompany_cd() {
		return company_cd;
	}

	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}

	public String getPlant_cd() {
		return plant_cd;
	}

	public void setPlant_cd(String plant_cd) {
		this.plant_cd = plant_cd;
	}

	public String getDoc_no() {
		return doc_no;
	}

	public void setDoc_no(String doc_no) {
		this.doc_no = doc_no;
	}

	public String getOper_drpt_insert_dt() {
		return oper_drpt_insert_dt;
	}

	public void setOper_drpt_insert_dt(String oper_drpt_insert_dt) {
		this.oper_drpt_insert_dt = oper_drpt_insert_dt;
	}

	public String getWthr_fg() {
		return wthr_fg;
	}

	public void setWthr_fg(String wthr_fg) {
		this.wthr_fg = wthr_fg;
	}

	public String getDrv_tmpt() {
		return drv_tmpt;
	}

	public void setDrv_tmpt(String drv_tmpt) {
		this.drv_tmpt = drv_tmpt;
	}

	public String getEqp_cd() {
		return eqp_cd;
	}

	public void setEqp_cd(String eqp_cd) {
		this.eqp_cd = eqp_cd;
	}

	public String getEqp_nm() {
		return eqp_nm;
	}

	public void setEqp_nm(String eqp_nm) {
		this.eqp_nm = eqp_nm;
	}

	public String getWrtr_id() {
		return wrtr_id;
	}

	public void setWrtr_id(String wrtr_id) {
		this.wrtr_id = wrtr_id;
	}

	public String getAthz_st_cd() {
		return athz_st_cd;
	}

	public void setAthz_st_cd(String athz_st_cd) {
		this.athz_st_cd = athz_st_cd;
	}

	public String getInsert_id() {
		return insert_id;
	}

	public void setInsert_id(String insert_id) {
		this.insert_id = insert_id;
	}

	public String getInsert_ip() {
		return insert_ip;
	}

	public void setInsert_ip(String insert_ip) {
		this.insert_ip = insert_ip;
	}

	public String getInsert_mcaddr_nm() {
		return insert_mcaddr_nm;
	}

	public void setInsert_mcaddr_nm(String insert_mcaddr_nm) {
		this.insert_mcaddr_nm = insert_mcaddr_nm;
	}

	public String getInsert_dts() {
		return insert_dts;
	}

	public void setInsert_dts(String insert_dts) {
		this.insert_dts = insert_dts;
	}

	public String getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(String update_id) {
		this.update_id = update_id;
	}

	public String getUpdate_ip() {
		return update_ip;
	}

	public void setUpdate_ip(String update_ip) {
		this.update_ip = update_ip;
	}

	public String getUpdate_mcaddr_nm() {
		return update_mcaddr_nm;
	}

	public void setUpdate_mcaddr_nm(String update_mcaddr_nm) {
		this.update_mcaddr_nm = update_mcaddr_nm;
	}

	public String getUpdate_dts() {
		return update_dts;
	}

	public void setUpdate_dts(String update_dts) {
		this.update_dts = update_dts;
	}

	public String getPlant_nm() {
		return plant_nm;
	}

	public void setPlant_nm(String plant_nm) {
		this.plant_nm = plant_nm;
	}
	
}

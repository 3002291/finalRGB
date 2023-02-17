package com.douzone.comet.service.eh.evrwaq.models;

import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;

@DzModel(name = "evrwaq00100_PRV", desc = "방지시설가동정보")
public class Evrwaq00100_PRV {
	
	@SerializedName("COMPANY_CD")
	@DzModelField(name = "COMPANY_CD", desc = "회사코드", colName = "COMPANY_CD")
	private String company_cd;
	
	@SerializedName("PLANT_CD")
	@DzModelField(name = "PLANT_CD", desc = "공장코드", colName = "PLANT_CD")
	private String plant_cd;
	
	@SerializedName("DOC_NO")
	@DzModelField(name = "DOC_NO", desc = "문서번호", colName = "DOC_NO")
	private String doc_no;
	
	@SerializedName("PRVNFCLT_CD")
	@DzModelField(name = "PRVNFCLT_CD", desc = "방지시설코드", colName = "PRVNFCLT_CD")
	private String prvnfclt_cd;
	
	@SerializedName("PRVNFCLT_NM")
	@DzModelField(name = "PRVNFCLT_NM", desc = "방지시설명", colName = "PRVNFCLT_NM")
	private String prvnfclt_nm;
	
	@SerializedName("START_TM")
	@DzModelField(name = "START_TM", desc = "시작시간", colName = "START_TM")
	private String start_tm;
	
	@SerializedName("END_TM")
	@DzModelField(name = "END_TM", desc = "종료시간", colName = "END_TM")
	private String end_tm;
	
	@SerializedName("OPRN_TM")
	@DzModelField(name = "OPRN_TM", desc = "가동시간", colName = "OPRN_TM")
	private String oprn_tm;
	
	@SerializedName("NSHIFT_BWRK_MAN_NM")
	@DzModelField(name = "NSHIFT_BWRK_MAN_NM", desc = "야간근무시간근무자명", colName = "NSHIFT_BWRK_MAN_NM")
	private String nshift_bwrk_man_nm;
	
	@SerializedName("DSHIFT_BWRK_MAN_NM")
	@DzModelField(name = "DSHIFT_BWRK_MAN_NM", desc = "오후근무시간근무자명", colName = "DSHIFT_BWRK_MAN_NM")
	private String dshift_bwrk_man_nm;
	
	@SerializedName("ASHIFT_BWRK_MAN_NM")
	@DzModelField(name = "ASHIFT_BWRK_MAN_NM", desc = "오전근무시간근무자명", colName = "ASHIFT_BWRK_MAN_NM")
	private String ashift_bwrk_man_nm;
	
	@SerializedName("RMK_DC")
	@DzModelField(name = "RMK_DC", desc = "비고내역", colName = "RMK_DC")
	private String rmk_dc;
	
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
	
	@SerializedName("Before_PRVNFCLT_CD")
	@DzModelField(name = "Before_PRVNFCLT_CD", desc = "배출방지코드_수정이전코드", colName = "Before_PRVNFCLT_CD")
	private String before_prvnfclt_cd;

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

	public String getPrvnfclt_cd() {
		return prvnfclt_cd;
	}

	public void setPrvnfclt_cd(String prvnfclt_cd) {
		this.prvnfclt_cd = prvnfclt_cd;
	}

	public String getPrvnfclt_nm() {
		return prvnfclt_nm;
	}

	public void setPrvnfclt_nm(String prvnfclt_nm) {
		this.prvnfclt_nm = prvnfclt_nm;
	}

	public String getStart_tm() {
		return start_tm;
	}

	public void setStart_tm(String start_tm) {
		this.start_tm = start_tm;
	}

	public String getEnd_tm() {
		return end_tm;
	}

	public void setEnd_tm(String end_tm) {
		this.end_tm = end_tm;
	}

	public String getOprn_tm() {
		return oprn_tm;
	}

	public void setOprn_tm(String oprn_tm) {
		this.oprn_tm = oprn_tm;
	}

	public String getNshift_bwrk_man_nm() {
		return nshift_bwrk_man_nm;
	}

	public void setNshift_bwrk_man_nm(String nshift_bwrk_man_nm) {
		this.nshift_bwrk_man_nm = nshift_bwrk_man_nm;
	}

	public String getDshift_bwrk_man_nm() {
		return dshift_bwrk_man_nm;
	}

	public void setDshift_bwrk_man_nm(String dshift_bwrk_man_nm) {
		this.dshift_bwrk_man_nm = dshift_bwrk_man_nm;
	}

	public String getAshift_bwrk_man_nm() {
		return ashift_bwrk_man_nm;
	}

	public void setAshift_bwrk_man_nm(String ashift_bwrk_man_nm) {
		this.ashift_bwrk_man_nm = ashift_bwrk_man_nm;
	}

	public String getRmk_dc() {
		return rmk_dc;
	}

	public void setRmk_dc(String rmk_dc) {
		this.rmk_dc = rmk_dc;
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

	public String getBefore_prvnfclt_cd() {
		return before_prvnfclt_cd;
	}

	public void setBefore_prvnfclt_cd(String before_prvnfclt_cd) {
		this.before_prvnfclt_cd = before_prvnfclt_cd;
	}
}

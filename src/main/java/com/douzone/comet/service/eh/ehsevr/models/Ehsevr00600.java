package com.douzone.comet.service.eh.ehsevr.models;
 
import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00600", desc = "Ehsevr00600_CRUD", tableName = "")
public class Ehsevr00600 extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	
	@SerializedName("PLANT_NM")
	@DzModelField(name="plant_nm", desc="공장명", colName="PLANT_NM", colSize="7", isKey=false)
	private String plant_nm;
	  
	@SerializedName("CNT_ANAL_TRGT_CD")
	@DzModelField(name="cnt_anal_trgt_cd", desc="수분석대상코드", colName="CNT_ANAL_TRGT_CD", colSize="20", isKey=false)
	private String cnt_anal_trgt_cd;
	  
	@SerializedName("CNT_ANAL_TRGT_NM")
	@DzModelField(name="cnt_anal_trgt_nm", desc="수분석대상명", colName="CNT_ANAL_TRGT_NM", colSize="100", isKey=false)
	private String cnt_anal_trgt_nm;
	  
	@SerializedName("MESR_CLAS_CD")
	@DzModelField(name="mesr_clas_cd", desc="측정항목코드", colName="MESR_CLAS_CD", colSize="20", isKey=false)
	private String mesr_clas_cd;
	  
	@SerializedName("MESR_CLAS_NM")
	@DzModelField(name="mesr_clas_nm", desc="측정항목명", colName="MESR_CLAS_NM", colSize="100", isKey=false)
	private String mesr_clas_nm;
	  
	@SerializedName("BASE_UNIT_CD")
	@DzModelField(name="base_unit_cd", desc="기본단위코드", colName="BASE_UNIT_CD", colSize="5", isKey=false)
	private String base_unit_cd;
	  
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	  
	@SerializedName("RMK_DC")
	@DzModelField(name="rmk_dc", desc="비고내역", colName="RMK_DC", colSize="200", isKey=false)
	private String rmk_dc;
	  
	@SerializedName("INSERT_ID")
	@DzModelField(name="insert_id", desc="등록ID", colName="INSERT_ID", colSize="30", isKey=false)
	private String insert_id;
	  
	@SerializedName("INSERT_IP")
	@DzModelField(name="insert_ip", desc="등록IP", colName="INSERT_IP", colSize="200", isKey=false)
	private String insert_ip;
	  
	@SerializedName("INSERT_MCADDR_NM")
	@DzModelField(name="insert_mcaddr_nm", desc="등록맥어드레스명", colName="INSERT_MCADDR_NM", colSize="200", isKey=false)
	private String insert_mcaddr_nm;
	  
	@SerializedName("INSERT_DTS")
	@DzModelField(name="insert_dts", desc="등록일시", colName="INSERT_DTS", colSize="0", isKey=false)
	private String insert_dts;
	  
	@SerializedName("UPDATE_ID")
	@DzModelField(name="update_id", desc="수정ID", colName="UPDATE_ID", colSize="30", isKey=false)
	private String update_id;
	  
	@SerializedName("UPDATE_IP")
	@DzModelField(name="update_ip", desc="수정IP", colName="UPDATE_IP", colSize="200", isKey=false)
	private String update_ip;
	  
	@SerializedName("UPDATE_MCADDR_NM")
	@DzModelField(name="update_mcaddr_nm", desc="수정맥어드레스명", colName="UPDATE_MCADDR_NM", colSize="200", isKey=false)
	private String update_mcaddr_nm;
	  
	@SerializedName("UPDATE_DTS")
	@DzModelField(name="update_dts", desc="수정일시", colName="UPDATE_DTS", colSize="0", isKey=false)
	private String update_dts;

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
	
	public String getPlant_nm() {
		return plant_nm;
	}

	public void setPlant_nm(String plant_nm) {
		this.plant_nm = plant_nm;
	}

	public String getCnt_anal_trgt_cd() {
		return cnt_anal_trgt_cd;
	}

	public void setCnt_anal_trgt_cd(String cnt_anal_trgt_cd) {
		this.cnt_anal_trgt_cd = cnt_anal_trgt_cd;
	}
 
	public String getCnt_anal_trgt_nm() {
		return cnt_anal_trgt_nm;
	}

	public void setCnt_anal_trgt_nm(String cnt_anal_trgt_nm) {
		this.cnt_anal_trgt_nm = cnt_anal_trgt_nm;
	}
 
	public String getMesr_clas_cd() {
		return mesr_clas_cd;
	}

	public void setMesr_clas_cd(String mesr_clas_cd) {
		this.mesr_clas_cd = mesr_clas_cd;
	}
 
	public String getMesr_clas_nm() {
		return mesr_clas_nm;
	}

	public void setMesr_clas_nm(String mesr_clas_nm) {
		this.mesr_clas_nm = mesr_clas_nm;
	}
 
	public String getBase_unit_cd() {
		return base_unit_cd;
	}

	public void setBase_unit_cd(String base_unit_cd) {
		this.base_unit_cd = base_unit_cd;
	}
 
	public String getSq_no() {
		return sq_no;
	}

	public void setSq_no(String sq_no) {
		this.sq_no = sq_no;
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
}

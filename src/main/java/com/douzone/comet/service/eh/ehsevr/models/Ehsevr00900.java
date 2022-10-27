package com.douzone.comet.service.eh.ehsevr.models;

import java.util.Date;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00900", desc = "폭기조구분등록 모델")
public class Ehsevr00900 extends DzAbstractModel {
	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	  
	@SerializedName("EQP_CD")
	@DzModelField(name="eqp_cd", desc="설비코드", colName="EQP_CD", colSize="50", isKey=false)
	private String eqp_cd;
	  
	@SerializedName("EQP_NM")
	@DzModelField(name="eqp_nm", desc="설비명", colName="EQP_NM", colSize="100", isKey=false)
	private String eqp_nm;
	  
	@SerializedName("ARTTK_CD")
	@DzModelField(name="arttk_cd", desc="폭기조코드", colName="ARTTK_CD", colSize="20", isKey=false)
	private String arttk_cd;
	  
	@SerializedName("ARTTK_NM")
	@DzModelField(name="arttk_nm", desc="폭기조명", colName="ARTTK_NM", colSize="100", isKey=false)
	private String arttk_nm;
	  
	@SerializedName("FACI_CD")
	@DzModelField(name="faci_cd", desc="시설코드", colName="FACI_CD", colSize="20", isKey=false)
	private String faci_cd;
	  
	@SerializedName("FACI_DC")
	@DzModelField(name="faci_dc", desc="시설내역", colName="FACI_DC", colSize="200", isKey=false)
	private String faci_dc;
	  
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
	private Date insert_dts;
	  
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
	private Date update_dts;

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
 
	public String getArttk_cd() {
		return arttk_cd;
	}

	public void setArttk_cd(String arttk_cd) {
		this.arttk_cd = arttk_cd;
	}
 
	public String getArttk_nm() {
		return arttk_nm;
	}

	public void setArttk_nm(String arttk_nm) {
		this.arttk_nm = arttk_nm;
	}
 
	public String getFaci_cd() {
		return faci_cd;
	}

	public void setFaci_cd(String faci_cd) {
		this.faci_cd = faci_cd;
	}
 
	public String getFaci_dc() {
		return faci_dc;
	}

	public void setFaci_dc(String faci_dc) {
		this.faci_dc = faci_dc;
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
 
	public Date getInsert_dts() {
		return insert_dts;
	}

	public void setInsert_dts(Date insert_dts) {
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
 
	public Date getUpdate_dts() {
		return update_dts;
	}

	public void setUpdate_dts(Date update_dts) {
		this.update_dts = update_dts;
	}
}

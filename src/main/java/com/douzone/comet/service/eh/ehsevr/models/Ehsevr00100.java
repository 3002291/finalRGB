package com.douzone.comet.service.eh.ehsevr.models;
 
import java.util.Date;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00100", desc = "Ehsevr00100", tableName = "")
public class Ehsevr00100 extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	  
	@SerializedName("PLANT_NM")
	@DzModelField(name="plant_nm", desc="공장명", colName="PLANT_NM", colSize="50", isKey=false)
	private String plant_nm;
	  
	@SerializedName("EQP_CD")
	@DzModelField(name="eqp_cd", desc="설비코드", colName="EQP_CD", colSize="50", isKey=false)
	private String eqp_cd;
	  
	@SerializedName("EQP_NM")
	@DzModelField(name="eqp_nm", desc="설비명", colName="EQP_NM", colSize="100", isKey=false)
	private String eqp_nm;
	  
	@SerializedName("ENV_TSK_FG_CD")
	@DzModelField(name="env_tsk_fg_cd", desc="환경업무구분코드", colName="ENV_TSK_FG_CD", colSize="10", isKey=false)
	private String env_tsk_fg_cd;
	  
	@SerializedName("ENV_TSK_FG_NM")
	@DzModelField(name="env_tsk_fg_nm", desc="환경업무구분명", colName="ENV_TSK_FG_NM", colSize="10", isKey=false)
	private String env_tsk_fg_nm;
	  
	@SerializedName("PRVNFCLT_CD")
	@DzModelField(name="prvnfclt_cd", desc="방지시설코드", colName="PRVNFCLT_CD", colSize="20", isKey=false)
	private String prvnfclt_cd;
	  
	@SerializedName("PRVNFCLT_NM")
	@DzModelField(name="prvnfclt_nm", desc="방지시설명", colName="PRVNFCLT_NM", colSize="100", isKey=false)
	private String prvnfclt_nm;
	  
	@SerializedName("LOCATION_NM")
	@DzModelField(name="location_nm", desc="위치명", colName="LOCATION_NM", colSize="50", isKey=false)
	private String location_nm;
	  
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
 
	public String getEnv_tsk_fg_cd() {
		return env_tsk_fg_cd;
	}

	public void setEnv_tsk_fg_cd(String env_tsk_fg_cd) {
		this.env_tsk_fg_cd = env_tsk_fg_cd;
	}
 
	public String getEnv_tsk_fg_nm() {
		return env_tsk_fg_nm;
	}

	public void setEnv_tsk_fg_nm(String env_tsk_fg_nm) {
		this.env_tsk_fg_nm = env_tsk_fg_nm;
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
 
	public String getLocation_nm() {
		return location_nm;
	}

	public void setLocation_nm(String location_nm) {
		this.location_nm = location_nm;
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
	
    @Override
    public String toString() {
      return
        "company_cd: ["+ company_cd +"]\n"+
        "plant_cd: ["+ plant_cd +"]\n"+
        "plant_nm: ["+ plant_nm +"]\n"+
        "eqp_cd: ["+ eqp_cd +"]\n"+
        "eqp_nm: ["+ eqp_nm +"]\n"+
        "env_tsk_fg_cd: ["+ env_tsk_fg_cd +"]\n"+
        "env_tsk_fg_nm: ["+ env_tsk_fg_nm +"]\n"+
        "prvnfclt_cd: ["+ prvnfclt_cd +"]\n"+
        "prvnfclt_nm: ["+ prvnfclt_nm +"]\n"+
        "location_nm: ["+ location_nm +"]\n"+
        "sq_no: ["+ sq_no +"]\n"+
        "rmk_dc: ["+ rmk_dc +"]";
    }
}

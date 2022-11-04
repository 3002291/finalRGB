package com.douzone.comet.service.eh.ehsevr.models;
 
import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00800", desc = "Ehsevr00800", tableName = "")
public class Ehsevr00800 extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	
	@SerializedName("ORG_PLANT_CD")
	@DzModelField(name="org_plant_cd", desc="공장코드", colName="ORG_PLANT_CD", colSize="7", isKey=false)
	private String org_plant_cd;
	
	@SerializedName("ORG_ENV_TSK_FG_CD")
	@DzModelField(name="org_env_tsk_fg_cd", desc="환경업무구분코드", colName="ORG_ENV_TSK_FG_CD", colSize="10", isKey=false)
	private String org_env_tsk_fg_cd;
	
	@SerializedName("ORG_FG_CD")
	@DzModelField(name="org_fg_cd", desc="구분코드", colName="ORG_FG_CD", colSize="5", isKey=false)
	private String org_fg_cd;
	
	@SerializedName("ORG_CMCL_CD")
	@DzModelField(name="org_cmcl_cd", desc="화학약품코드", colName="ORG_CMCL_CD", colSize="20", isKey=false)
	private String org_cmcl_cd;
	
	@SerializedName("PLANT_NM")
	@DzModelField(name="plant_nm", desc="공장코드명", colName="PLANT_NM", colSize="7", isKey=false)
	private String plant_nm;
	  
	@SerializedName("ENV_TSK_FG_CD")
	@DzModelField(name="env_tsk_fg_cd", desc="환경업무구분코드", colName="ENV_TSK_FG_CD", colSize="10", isKey=false)
	private String env_tsk_fg_cd;
	  
	@SerializedName("ENV_TSK_FG_NM")
	@DzModelField(name="env_tsk_fg_nm", desc="환경업무구분명", colName="ENV_TSK_FG_NM", colSize="10", isKey=false)
	private String env_tsk_fg_nm;
	  
	@SerializedName("FG_CD")
	@DzModelField(name="fg_cd", desc="구분코드", colName="FG_CD", colSize="5", isKey=false)
	private String fg_cd;
	  
	@SerializedName("FG_NM")
	@DzModelField(name="fg_nm", desc="구분명", colName="FG_NM", colSize="50", isKey=false)
	private String fg_nm;
	  
	@SerializedName("CMCL_CD")
	@DzModelField(name="cmcl_cd", desc="화학약품코드", colName="CMCL_CD", colSize="20", isKey=false)
	private String cmcl_cd;
	  
	@SerializedName("CMCL_NM")
	@DzModelField(name="cmcl_nm", desc="화학약품명", colName="CMCL_NM", colSize="100", isKey=false)
	private String cmcl_nm;
	  
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
 
	public String getFg_cd() {
		return fg_cd;
	}

	public void setFg_cd(String fg_cd) {
		this.fg_cd = fg_cd;
	}
 
	public String getFg_nm() {
		return fg_nm;
	}

	public void setFg_nm(String fg_nm) {
		this.fg_nm = fg_nm;
	}
 
	public String getCmcl_cd() {
		return cmcl_cd;
	}

	public void setCmcl_cd(String cmcl_cd) {
		this.cmcl_cd = cmcl_cd;
	}
 
	public String getCmcl_nm() {
		return cmcl_nm;
	}

	public void setCmcl_nm(String cmcl_nm) {
		this.cmcl_nm = cmcl_nm;
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

	public String getOrg_plant_cd() {
		return org_plant_cd;
	}

	public void setOrg_plant_cd(String org_plant_cd) {
		this.org_plant_cd = org_plant_cd;
	}

	public String getOrg_env_tsk_fg_cd() {
		return org_env_tsk_fg_cd;
	}

	public void setOrg_env_tsk_fg_cd(String org_env_tsk_fg_cd) {
		this.org_env_tsk_fg_cd = org_env_tsk_fg_cd;
	}

	public String getOrg_fg_cd() {
		return org_fg_cd;
	}

	public void setOrg_fg_cd(String org_fg_cd) {
		this.org_fg_cd = org_fg_cd;
	}

	public String getOrg_cmcl_cd() {
		return org_cmcl_cd;
	}

	public void setOrg_cmcl_cd(String org_cmcl_cd) {
		this.org_cmcl_cd = org_cmcl_cd;
	}
}

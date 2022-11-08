package com.douzone.comet.service.eh.ehsevr.models;
 
import java.util.Date;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00300", desc = "Ehsevr00300", tableName = "")
public class Ehsevr00300 extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	  
	@SerializedName("PLANT_NM")
	@DzModelField(name="plant_nm", desc="공장명", colName="PLANT_NM", colSize="50", isKey=false)
	private String plant_nm;
	  
	@SerializedName("WT_SCSPL_CD")
	@DzModelField(name="wt_scspl_cd", desc="용수공급원코드", colName="WT_SCSPL_CD", colSize="20", isKey=false)
	private String wt_scspl_cd;
	  
	@SerializedName("WT_SCSPL_NM")
	@DzModelField(name="wt_scspl_nm", desc="용수공급원명", colName="WT_SCSPL_NM", colSize="100", isKey=false)
	private String wt_scspl_nm;
	  
	@SerializedName("UNT_NM")
	@DzModelField(name="unt_nm", desc="호기명", colName="UNT_NM", colSize="50", isKey=false)
	private String unt_nm;
	  
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
 
	public String getPlant_nm() {
		return plant_nm;
	}

	public void setPlant_nm(String plant_nm) {
		this.plant_nm = plant_nm;
	}
 
	public String getWt_scspl_cd() {
		return wt_scspl_cd;
	}

	public void setWt_scspl_cd(String wt_scspl_cd) {
		this.wt_scspl_cd = wt_scspl_cd;
	}
 
	public String getWt_scspl_nm() {
		return wt_scspl_nm;
	}

	public void setWt_scspl_nm(String wt_scspl_nm) {
		this.wt_scspl_nm = wt_scspl_nm;
	}
 
	public String getUnt_nm() {
		return unt_nm;
	}

	public void setUnt_nm(String unt_nm) {
		this.unt_nm = unt_nm;
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
	
    @Override
    public String toString() {
      return
        "company_cd: ["+ company_cd +"]\n"+
        "plant_cd: ["+ plant_cd +"]\n"+
        "plant_nm: ["+ plant_nm +"]\n"+
        "wt_scspl_cd: ["+ wt_scspl_cd +"]\n"+
        "wt_scspl_nm: ["+ wt_scspl_nm +"]\n"+
        "unt_nm: ["+ unt_nm +"]\n"+
        "rmk_dc: ["+ rmk_dc +"]\n"+
        "insert_id: ["+ insert_id +"]\n"+
        "insert_ip: ["+ insert_ip +"]\n"+
        "insert_mcaddr_nm: ["+ insert_mcaddr_nm +"]\n"+
        "insert_dts: ["+ insert_dts +"]\n"+
        "update_id: ["+ update_id +"]\n"+
        "update_ip: ["+ update_ip +"]\n"+
        "update_mcaddr_nm: ["+ update_mcaddr_nm +"]\n"+
        "update_dts: ["+ update_dts +"]";
    }
}

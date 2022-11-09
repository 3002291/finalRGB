package com.douzone.comet.service.eh.ehsevr.models;
 
import java.util.Date;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00500", desc = "Ehsevr00500", tableName = "")
public class Ehsevr00500 extends DzAbstractModel {

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
	  
	@SerializedName("WHM_CD")
	@DzModelField(name="whm_cd", desc="전력량계코드", colName="WHM_CD", colSize="20", isKey=false)
	private String whm_cd;
	  
	@SerializedName("WHM_NM")
	@DzModelField(name="whm_nm", desc="전력량계명", colName="WHM_NM", colSize="100", isKey=false)
	private String whm_nm;
	  
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
	  
	@SerializedName("UPDATE_DTS")
	@DzModelField(name="update_dts", desc="수정일시", colName="UPDATE_DTS", colSize="200", isKey=false)
	private Date update_dts;
	
	

	public String getPlant_nm() {
		return plant_nm;
	}

	public void setPlant_nm(String plant_nm) {
		this.plant_nm = plant_nm;
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
 
	public String getWhm_cd() {
		return whm_cd;
	}

	public void setWhm_cd(String whm_cd) {
		this.whm_cd = whm_cd;
	}
 
	public String getWhm_nm() {
		return whm_nm;
	}

	public void setWhm_nm(String whm_nm) {
		this.whm_nm = whm_nm;
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
        "eqp_cd: ["+ eqp_cd +"]\n"+
        "eqp_nm: ["+ eqp_nm +"]\n"+
        "whm_cd: ["+ whm_cd +"]\n"+
        "whm_nm: ["+ whm_nm +"]\n"+
        "sq_no: ["+ sq_no +"]\n"+
        "rmk_dc: ["+ rmk_dc +"]\n"+
        "insert_id: ["+ insert_id +"]\n"+
        "insert_ip: ["+ insert_ip +"]\n"+
        "insert_mcaddr_nm: ["+ insert_mcaddr_nm +"]\n"+
        "insert_dts: ["+ insert_dts +"]\n"+
        "update_id: ["+ update_id +"]\n"+
        "update_ip: ["+ update_ip +"]\n"+
        "update_dts: ["+ update_dts +"]";
    }
}

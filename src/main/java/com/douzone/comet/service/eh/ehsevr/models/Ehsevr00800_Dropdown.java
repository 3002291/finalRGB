package com.douzone.comet.service.eh.ehsevr.models;
 
import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00800_Dropdown", desc = "Ehsevr00800 드롭다운", tableName = "")
public class Ehsevr00800_Dropdown extends DzAbstractModel {

	@SerializedName("SYSDEF_CD")
	@DzModelField(name="sysdef_cd", desc="시스템정의코드", colName="SYSDEF_CD", colSize="20", isKey=false)
	private String sysdef_cd;
	  
	@SerializedName("SYSDEF_NM")
	@DzModelField(name="sysdef_nm", desc="시스템정의명", colName="SYSDEF_NM", colSize="100", isKey=false)
	private String sysdef_nm;

	public String getSysdef_cd() {
		return sysdef_cd;
	}

	public void setSysdef_cd(String sysdef_cd) {
		this.sysdef_cd = sysdef_cd;
	}
 
	public String getSysdef_nm() {
		return sysdef_nm;
	}

	public void setSysdef_nm(String sysdef_nm) {
		this.sysdef_nm = sysdef_nm;
	}
}

package com.douzone.comet.service.eh.ehsevr.models;
 
import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Ehsevr00100Drop1", desc = "Ehsevr00100Drop1", tableName = "")
public class Ehsevr00100Drop1 extends DzAbstractModel {

	@SerializedName("MNG_DTL_CD")
	@DzModelField(name="mng_dtl_cd", desc="관리상세코드", colName="MNG_DTL_CD", colSize="20", isKey=false)
	private String mng_dtl_cd;
	  
	@SerializedName("MNG_DTL_NM")
	@DzModelField(name="mng_dtl_nm", desc="관리상세명", colName="MNG_DTL_NM", colSize="100", isKey=false)
	private String mng_dtl_nm;

	public String getMng_dtl_cd() {
		return mng_dtl_cd;
	}

	public void setMng_dtl_cd(String mng_dtl_cd) {
		this.mng_dtl_cd = mng_dtl_cd;
	}
 
	public String getMng_dtl_nm() {
		return mng_dtl_nm;
	}

	public void setMng_dtl_nm(String mng_dtl_nm) {
		this.mng_dtl_nm = mng_dtl_nm;
	}
	
    @Override
    public String toString() {
      return
        "mng_dtl_cd: ["+ mng_dtl_cd +"]\n"+
        "mng_dtl_nm: ["+ mng_dtl_nm +"]";
    }
}

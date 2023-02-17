package com.douzone.comet.service.eh.evrwaq.models;

import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;

@DzModel(name = "evrwaq00100_Drop", desc = "폐수방지시설-날씨드롭")
public class Evrwaq00100_Drop {
	
	@SerializedName("MNG_DTL_CD")
	@DzModelField(name = "MNG_DTL_CD", desc = "관리상세코드", colName = "MNG_DTL_CD")
	private String mng_dtl_cd;
	
	@SerializedName("MNG_DTL_NM")
	@DzModelField(name = "MNG_DTL_NM", desc = "관리상세명", colName = "MNG_DTL_NM")
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
}

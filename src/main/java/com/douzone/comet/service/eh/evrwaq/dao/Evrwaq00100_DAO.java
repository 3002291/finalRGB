package com.douzone.comet.service.eh.evrwaq.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_DSC;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_Drop;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_MASTER;
import com.douzone.comet.service.eh.evrwaq.models.Evrwaq00100_PRV;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;

@Repository
public class Evrwaq00100_DAO {
	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Evrwaq00100_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}
	private String getMapperName(String id) {
		return MyBatisUtil.getId(this.getClass(), "Evrwaq00100_DAO."+id);
	}
	// 마스터(MASTER) 그리드 조회
	public List<Evrwaq00100_MASTER> evrwaq00100_MASTER_list(String name, HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
	// 날씨 드롭다운 리스트 조회
	public List<Evrwaq00100_Drop> evrwaq00100_Drop_list(String name, HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
	// 배출시설(DSC) 그리드 조회
    public List<Evrwaq00100_DSC> evrwaq00100_DSC_list(String name, HashMap<String, Object> parameters) throws Exception {
        return this.mybatisSupport.selectList(getMapperName(name), parameters);
    }
    // 방지시설(PRV) 그리드 조회
    public List<Evrwaq00100_PRV> evrwaq00100_PRV_list(String name, HashMap<String, Object> parameters) throws Exception {
        return this.mybatisSupport.selectList(getMapperName(name), parameters);
    }
    // 마스터(MASTER) 문서번호 중복체크
	public int evrwaq00100_doc_check(String name, HashMap<String, Object> parameters) throws Exception {
		int count = this.mybatisSupport.selectOne(getMapperName(name), parameters);
		return count;
	}
	// 마스터(MASTER)-배출시설(DSC) 그리드 데이터 확인
	public int evrwaq00100_existDSC(String name, HashMap<String, Object> parameters) throws Exception {
		int cntDSC = this.mybatisSupport.selectOne(getMapperName(name), parameters);
		return cntDSC;
	}
	// 마스터(MASTER)-방지시설(PRV) 그리드 데이터 확인
	public int evrwaq00100_existPRV(String name, HashMap<String, Object> parameters) throws Exception {
		int cntPRV = this.mybatisSupport.selectOne(getMapperName(name), parameters);
		return cntPRV;
	}
	// 마스터(MASTER) 삽입
	public void evrwaq00100_MST_insert(String name, HashMap<String, Object> parameters) throws Exception {
		this.mybatisSupport.insert(getMapperName(name), parameters);
	}
	// 마스터(MASTER) 수정
	public void evrwaq00100_MST_update(String name, HashMap<String, Object> parameters) throws Exception {
		this.mybatisSupport.update(getMapperName(name), parameters);
	}
	// 마스터(MASTER) 삭제
	public void evrwaq00100_MST_delete(String name, HashMap<String, Object> parameters) throws Exception {
		this.mybatisSupport.delete(getMapperName(name), parameters);
	}
    // 배출시설(DSC) 시설코드 중복체크
    public List<Evrwaq00100_DSC> evrwaq00100_DSC_dupcheck(String name, HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(getMapperName(name), parameters);
    }
    // 배출시설(DSC) 삽입
    public void evrwaq00100_DSC_insert(String name, HashMap<String, Object> parameters) throws Exception {
    	this.mybatisSupport.insert(getMapperName(name), parameters);
    }
    // 배출시설(DSC) 수정
    public void evrwaq00100_DSC_update(String name, HashMap<String, Object> parameters) throws Exception {
        this.mybatisSupport.update(getMapperName(name), parameters);
    }
	// 배출시설(DSC) 수정 - 체크
	public List<Evrwaq00100_DSC> evrwaq00100_DSC_updatecheck(String name, HashMap<String, Object> parameters) throws Exception{
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
    // 배출시설(DSC) 삭제
    public void evrwaq00100_DSC_delete(String name, HashMap<String, Object> parameters) throws Exception {
        this.mybatisSupport.delete(getMapperName(name), parameters);
    }
    // 방지시설(PRV)시설코드 중복체크
    public List<Evrwaq00100_PRV> evrwaq00100_PRV_dupcheck(String name, HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(getMapperName(name), parameters);
    }
    // 방지시설(PRV) 삽입
    public void evrwaq00100_PRV_insert(String name, HashMap<String, Object> parameters) throws Exception {
    	this.mybatisSupport.insert(getMapperName(name), parameters);
    }
    // 방지시설(PRV) 수정
    public void evrwaq00100_PRV_update(String name, HashMap<String, Object> parameters) throws Exception {
        this.mybatisSupport.update(getMapperName(name), parameters);
    }
	// 방지시설(PRV) 수정 - 체크
	public List<Evrwaq00100_PRV> evrwaq00100_PRV_updatecheck(String name, HashMap<String, Object> parameters) throws Exception{
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
    // 방지시설(PRV) 삭제
    public void evrwaq00100_PRV_delete(String name, HashMap<String, Object> parameters) throws Exception {
        this.mybatisSupport.delete(getMapperName(name), parameters);
    }
	// 배출시설(DSC) 팝업 조회
	public List<Evrwaq00100_DSC> evrwaq00100_DSCpop_list(String name, HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
	// 배출시설(DSC) 코드 중복체크
	public List<Evrwaq00100_DSC> evrwaq00100_DSCpop_check(String name, HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
	// 방지시설(PRV) 팝업 조회
	public List<Evrwaq00100_PRV> evrwaq00100_PRVpop_list(String name, HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
	// 방지시설(PRV) 코드 중복체크
	public List<Evrwaq00100_PRV> evrwaq00100_PRVpop_check(String name, HashMap<String, Object> parameters) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), parameters);
	}
}

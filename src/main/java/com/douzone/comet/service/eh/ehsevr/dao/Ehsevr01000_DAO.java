package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr01000;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;

@Repository
public class Ehsevr01000_DAO {
	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr01000_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

    private String getMapperName(String id) {
//        return MyBatisUtil.getId(this.getClass(), "Ehsevr01000_DAO." + id);
        return MyBatisUtil.getId(this.getClass(), "dao.Ehsevr01000_DAO." + id);
    }
    
    public List<HashMap<String, Object>> list(String name, HashMap<String, Object> params) {
    	return this.mybatisSupport.selectList(getMapperName(name), params);
    }

    
	public List<Ehsevr01000> selectList(String name, HashMap<String, Object> params) throws Exception {
//		return this.mybatisSupport.selectList(getMapperName(name), params);
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectList", params);
	}

	/**
	 * 단일 데이터 입력 처리
	 * @param Puoord09400_z10075
	 */
	public void insertEhsevr01000(Ehsevr01000 ehsevr01000_temp) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertEhsevr01000", ehsevr01000_temp);
		// com.douzone.comet.service.eh.ehsevr.dao.Ehsevr01000_DAO
	}

	/**
	 * 단일 데이터 수정 처리
	 * @param puoord09400_z10075
	 */
	public void updateEhsevr01000(Ehsevr01000 ehsevr01000_temp) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateEhsevr01000", ehsevr01000_temp);
	}

	/**
	 * 단일 데이터 삭제 처리
	 * @param puoord09400_z10075
	 */
	public void deleteEhsevr01000(Ehsevr01000 ehsevr01000_temp) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteEhsevr01000", ehsevr01000_temp);
	}

	
}

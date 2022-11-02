package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00700;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00700_Dropdown;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00700;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;

@Repository
public class Ehsevr00700_DAO {
	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00700_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

    private String getMapperName(String id) {
        return MyBatisUtil.getId(this.getClass(), "dao.Ehsevr00700_DAO." + id);
    }
    
    public List<HashMap<String, Object>> list(String name, HashMap<String, Object> params) {
    	return this.mybatisSupport.selectList(getMapperName(name), params);
    }

    
	public List<Ehsevr00700> selectList(String name, HashMap<String, Object> params) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectList", params);
	}
	
	public List<Ehsevr00700_Dropdown> selectDropdownList(String name, HashMap<String, Object> params) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectDropdownList", params);
	}

	/**
	 * 단일 데이터 입력 처리
	 * @param Puoord09400_z10075
	 */
	public void insertEhsevr00700(Ehsevr00700 ehsevr00700_temp) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertEhsevr00700", ehsevr00700_temp);
		// com.douzone.comet.service.eh.ehsevr.dao.Ehsevr00700_DAO
	}

	/**
	 * 단일 데이터 수정 처리
	 * @param puoord09400_z10075
	 */
	public void updateEhsevr00700(Ehsevr00700 ehsevr00700_temp) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateEhsevr00700", ehsevr00700_temp);
	}

	/**
	 * 단일 데이터 삭제 처리
	 * @param puoord09400_z10075
	 */
	public void deleteEhsevr00700(Ehsevr00700 ehsevr00700_temp) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteEhsevr00700", ehsevr00700_temp);
	}
}

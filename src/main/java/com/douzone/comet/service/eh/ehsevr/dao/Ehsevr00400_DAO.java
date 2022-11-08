package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00400;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;

@Repository
public class Ehsevr00400_DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00400_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}
	
	private String getMapperName(String id) {
        return MyBatisUtil.getId(this.getClass(), "dao.Ehsevr00400_DAO." + id);
    }
	 

	/**
	 * 폐수구분목록 조회
	 * @param String name, HashMap<String, Object> params
	 * @return List<Ehsevr00400>
	 */
	public List<Ehsevr00400> selectList(String name, HashMap<String, Object> params) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), params);
	}

	
	/**
	 * 폐수구분목록 delete
	 * @param  List<Ehsevr00400> deleted
	 */
	public void deleteEhsevr00400(String name, List<Ehsevr00400> deleted) throws Exception{
		this.mybatisSupport.deleteBatch(getMapperName(name), deleted);
	}

	/**
	 * 폐수구분목록 update
	 * @param  List<Ehsevr00400> updated
	 */
	public void updateEhsevr00400(String name, List<Ehsevr00400> updated) throws Exception{
		this.mybatisSupport.updateBatch(getMapperName(name), updated);		
	}

	/**
	 * 폐수구분목록 insert
	 * @param  List<Ehsevr00400> inserted
	 */
	public void insertEhsevr00400(String name, List<Ehsevr00400> inserted) throws Exception{
		this.mybatisSupport.insertBatch(getMapperName(name), inserted);		
	}
}

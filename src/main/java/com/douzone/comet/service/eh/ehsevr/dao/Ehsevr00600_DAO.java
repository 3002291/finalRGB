package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00600;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;

@Repository
public class Ehsevr00600_DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00600_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}
	
	private String getMapperName(String id) {
        return MyBatisUtil.getId(this.getClass(), "dao.Ehsevr00600_DAO." + id);
    }

	/**
	 * 수질분석항목 목록 조회
	 * @param  String name, HashMap<String, Object> params
	 * @return List<Ehsevr00600>
	 */
	public List<Ehsevr00600> selectList(String name, HashMap<String, Object> params) throws Exception {
		return this.mybatisSupport.selectList(getMapperName(name), params);
	}

	/**
	 * 단일 데이터 조회
	 * @param ehsevr00600
	 * @return List<Ehsevr00600>
	 */
	public int selectOne(String name, Ehsevr00600 ehsevr00600) throws Exception {
		return this.mybatisSupport.selectOne(getMapperName(name), ehsevr00600);
	}

	/**
	 * 폐수구분목록 delete
	 * @param  List<Ehsevr00600> deleted
	 */
	public void deleteEhsevr00600(String name, List<Ehsevr00600> deleted) {
		this.mybatisSupport.deleteBatch(getMapperName(name), deleted);
	}
	
	/**
	 * 폐수구분목록 update
	 * @param  List<Ehsevr00600> updated
	 */
	public void updateEhsevr00600(String name, List<Ehsevr00600> updated) {
		this.mybatisSupport.updateBatch(getMapperName(name), updated);
	}

	/**
	 * 폐수구분목록 insert
	 * @param  List<Ehsevr00600> added
	 */
	public void insertEhsevr00600(String name, List<Ehsevr00600> added) {
		this.mybatisSupport.insertBatch(getMapperName(name), added);		
	}

}

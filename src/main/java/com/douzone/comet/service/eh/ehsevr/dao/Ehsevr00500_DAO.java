package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00500;

/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
  
@Repository
public class Ehsevr00500_DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00500_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

    public List<Ehsevr00500> list(String name,	HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(this.getClass().getName() + ".selectList", parameters);
    }
    
	public void deleteEhsevr00500(Ehsevr00500 Ehsevr00500_temp) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteEhsevr00500", Ehsevr00500_temp);
	}
	
	public void deleteEhsevr00500(List<Ehsevr00500> Ehsevr00500_temp) throws Exception {
		this.mybatisSupport.deleteBatch(this.getClass().getName() + ".deleteEhsevr00500", Ehsevr00500_temp);
	}
	
	public void updateEhsevr00500(Ehsevr00500 Ehsevr00500_temp) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateEhsevr00500", Ehsevr00500_temp);
	}
	
	public void updateEhsevr00500(List<Ehsevr00500> Ehsevr00500_temp) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".updateEhsevr00500", Ehsevr00500_temp);
	}

	public void insertEhsevr00500(Ehsevr00500 Ehsevr00500_temp) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertEhsevr00500", Ehsevr00500_temp);
	}
	
	public void insertEhsevr00500(List<Ehsevr00500> Ehsevr00500_temp) throws Exception {
		this.mybatisSupport.insertBatch(this.getClass().getName() + ".insertEhsevr00500", Ehsevr00500_temp);
	}
	
}

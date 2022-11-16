package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00200;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Ehsevr00200_DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00200_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	
    public List<Ehsevr00200> list(String name,	HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(this.getClass().getName() + ".selectList", parameters);
    }

	public void deleteEhsevr00200(Ehsevr00200 Ehsevr00200_temp) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteEhsevr00200", Ehsevr00200_temp);
	}
	public void deleteEhsevr00200(List<Ehsevr00200> Ehsevr00200_temp) throws Exception {
		this.mybatisSupport.deleteBatch(this.getClass().getName() + ".deleteEhsevr00200", Ehsevr00200_temp);
	}
	
	public void updateEhsevr00200(Ehsevr00200 Ehsevr00200_temp) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateEhsevr00200", Ehsevr00200_temp);
	}
	public void updateEhsevr00200(List<Ehsevr00200> Ehsevr00200_temp) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".updateEhsevr00200", Ehsevr00200_temp);
	}

	public void insertEhsevr00200(Ehsevr00200 Ehsevr00200_temp) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertEhsevr00200", Ehsevr00200_temp);
	}
	public void insertEhsevr00200(List<Ehsevr00200> Ehsevr00200_temp) throws Exception {
		this.mybatisSupport.insertBatch(this.getClass().getName() + ".insertEhsevr00200", Ehsevr00200_temp);
	}
}

package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00300;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00300Drop1;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Ehsevr00300_DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00300_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	
    public List<Ehsevr00300> list(String name,	HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(this.getClass().getName() + ".selectList", parameters);
    }
    
    public List<Ehsevr00300Drop1> listDrop(String name,	HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(this.getClass().getName() + name, parameters);
    }
    
	public void deleteEhsevr00300(Ehsevr00300 Ehsevr00300_temp) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteEhsevr00300", Ehsevr00300_temp);
	}
	public void deleteEhsevr00300(List<Ehsevr00300> Ehsevr00300_temp) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".deleteEhsevr00300", Ehsevr00300_temp);
	}
	
	public void updateEhsevr00300(Ehsevr00300 Ehsevr00300_temp) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateEhsevr00300", Ehsevr00300_temp);
	}
	public void updateEhsevr00300(List<Ehsevr00300> Ehsevr00300_temp) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".updateEhsevr00300", Ehsevr00300_temp);
	}

	public void insertEhsevr00300(Ehsevr00300 Ehsevr00300_temp) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertEhsevr00300", Ehsevr00300_temp);
	}
	public void insertEhsevr00300(List<Ehsevr00300> Ehsevr00300_temp) throws Exception {
		this.mybatisSupport.insertBatch(this.getClass().getName() + ".insertEhsevr00300", Ehsevr00300_temp);
	}
}

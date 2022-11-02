package com.douzone.comet.service.eh.ehsevr.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00100;
import com.douzone.comet.service.eh.ehsevr.models.Ehsevr00100Drop1;
import com.douzone.comet.service.util.mybatis.MyBatisUtil;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Ehsevr00100_DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Ehsevr00100_DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	
    public List<Ehsevr00100> list(String name,	HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(this.getClass().getName() + ".selectList", parameters);
    }
    
    public List<Ehsevr00100Drop1> listDrop(String name,	HashMap<String, Object> parameters) throws Exception {
    	return this.mybatisSupport.selectList(this.getClass().getName() + name, parameters);
    }
    
	public void deleteEhsevr00100(Ehsevr00100 ehsevr00100_temp) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteEhsevr00100", ehsevr00100_temp);
	}
	public void deleteEhsevr00100(List<Ehsevr00100> ehsevr00100_temp) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".deleteEhsevr00100", ehsevr00100_temp);
	}
	
	public void updateEhsevr00100(Ehsevr00100 ehsevr00100_temp) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateEhsevr00100", ehsevr00100_temp);
	}
	public void updateEhsevr00100(List<Ehsevr00100> ehsevr00100_temp) throws Exception {
		this.mybatisSupport.updateBatch(this.getClass().getName() + ".updateEhsevr00100", ehsevr00100_temp);
	}

	public void insertEhsevr00100(Ehsevr00100 ehsevr00100_temp) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertEhsevr00100", ehsevr00100_temp);
	}
	public void insertEhsevr00100(List<Ehsevr00100> ehsevr00100_temp) throws Exception {
		this.mybatisSupport.insertBatch(this.getClass().getName() + ".insertEhsevr00100", ehsevr00100_temp);
	}
}

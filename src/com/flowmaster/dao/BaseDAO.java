package com.flowmaster.dao;

import java.util.List;

import com.flowmaster.model.Candidate;
import javax.sql.DataSource;

public interface BaseDAO {

	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Candidate table.
	    */
	   public void create(String name, Integer age);
	   /** 
	    * This is the method to be used to list down
	    * a record from the Candidate table corresponding
	    * to a passed Candidate id.
	    */
	   public Candidate getCandidate(Integer id);
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Candidate table.
	    */
	   public List<Candidate> listCandidates();
	   /** 
	    * This is the method to be used to delete
	    * a record from the Candidate table corresponding
	    * to a passed Candidate id.
	    */
	   public void delete(Integer id);
	   /** 
	    * This is the method to be used to update
	    * a record into the Candidate table.
	    */
	   public void update(Integer id, Integer age);
	
}

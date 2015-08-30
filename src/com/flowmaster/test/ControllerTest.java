package com.flowmaster.test;

import org.junit.Assert;
import org.junit.Test;

import com.flowmaster.dao.AllDao;
import com.flowmaster.model.CandidateScore;

public class ControllerTest {		
	
	@Test	
	public void getCandidateStausTestSuccess(){		
		AllDao alldao = new AllDao();	
		String candidateName = "Raghu";
		CandidateScore candidateScore = alldao.getCandidateStaus(candidateName);		
		Assert.assertNotNull(candidateScore);	
		
	}
	
	@Test	
	public void getCandidateStausTestNoResult(){		
		AllDao alldao = new AllDao();	
		String candidateName = "Jeena";
		CandidateScore candidateScore = alldao.getCandidateStaus(candidateName);
		String candidName = candidateScore.getCandidateName();
		Assert.assertEquals("Name Not in DB", null, candidName);	
		
	}
	
	
	@Test(expected=NullPointerException.class)	
	public void insertInterviewResultSQLException(){		
		AllDao alldao = new AllDao();	
		CandidateScore candidateScore = null;			
		alldao.insertInterviewResult(candidateScore);					
		
	}
	
	
	
	

}

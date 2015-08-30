package com.flowmaster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.flowmaster.model.Candidate;
import com.flowmaster.model.CandidateScore;
import com.flowmaster.util.ConnectionUtil;

public class AllDao {

	public boolean insertCandidate(Candidate candidate) {

		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
			String query = " insert into CANDIATE_TRACK (CANDIDATE_NAME, JOB_ID, EXPERIENCE, INTRERVIEWER_NAME, SKILLSET,ROUND_NAME)"
					+ " values (?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, candidate.getCandidateName());
			preparedStmt.setString(2, candidate.getJobId());
			preparedStmt.setString(3, candidate.getExperience());
			preparedStmt.setString(4, candidate.getInterviewer());
			preparedStmt.setString(5, candidate.getSkillSet());
			preparedStmt.setString(6, candidate.getRoundName());

			// execute the preparedstatement
			preparedStmt.executeUpdate();
			preparedStmt.close();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			return false;

		}

		finally {

			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					try {
						throw new Exception(e.getMessage());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					return false;
				}

		}

		return true;

	}
	
	public List<String> getAllInterviewer(){
		
		
		List<String> interviewerList = new ArrayList<String>();
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String query = "select INTRERVIEWER_NAME from interviewer_info";	
			 stmt = connection.createStatement();
			 rs = stmt.executeQuery(query);
			 
			 while (rs.next()) {
				 interviewerList.add(rs.getString("INTRERVIEWER_NAME"));                 
             }
			 
		} catch (SQLException e) {
			System.out.println(e.getMessage());	

		}
		finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					try {
						throw new Exception(e.getMessage());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}				
					
				}
		}	
		
		
		return interviewerList;
		
		
	}
	
public List<String> getAllCandidate(){
		
		
		List<String> candidateList = new ArrayList<String>();
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String query = "select CANDIDATE_NAME from CANDIATE_TRACK";	
			 stmt = connection.createStatement();
			 rs = stmt.executeQuery(query);
			 
			 while (rs.next()) {
				 candidateList.add(rs.getString("CANDIDATE_NAME"));                 
             }
			 
		} catch (SQLException e) {
			System.out.println(e.getMessage());	

		}
		finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					try {
						throw new Exception(e.getMessage());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}				
					
				}
		}	
		
		
		return candidateList;
		
		
	}

public List<String> getAllCandidatesForInterviewer(String interviewer){
	
	
	List<String> candidateList = new ArrayList<String>();
	
	Connection connection = null;	
	ResultSet rs = null;
	try {
		connection = ConnectionUtil.getConnection();
		String query = "select CANDIDATE_NAME from CANDIATE_TRACK where INTRERVIEWER_NAME=?";	
				 
		 PreparedStatement preparedStatement = connection
                 .prepareStatement(query);
         preparedStatement.setString(1, interviewer);
         
         rs = preparedStatement.executeQuery();
         while (rs.next()) {
        	 
        	 candidateList.add(rs.getString("CANDIDATE_NAME"));
        	 
         }
		 
	} catch (SQLException e) {
		System.out.println(e.getMessage());	

	}
	finally {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				try {
					throw new Exception(e.getMessage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				
			}
	}		
	
	return candidateList;
	
	
}

public boolean insertInterviewResult(CandidateScore candidateScore) {

	Connection connection = null;
	try {
		connection = ConnectionUtil.getConnection();
		String query = " insert into INTERVIEWER_TRACK (INTRERVIEWER_NAME, CANDIDATE_NAME, ROUND_NAME, JAVA_COMMENTS, SQL_COMMENTS,DEBUG_COMMENTS,COMM_COMMENTS,STATUS)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStmt = connection.prepareStatement(query);
		preparedStmt.setString(1, candidateScore.getInterviewer());
		preparedStmt.setString(2, candidateScore.getCandidateName());
		preparedStmt.setString(3, candidateScore.getRounds());
		preparedStmt.setString(4, candidateScore.getJava());
		preparedStmt.setString(5, candidateScore.getSql());
		preparedStmt.setString(6, candidateScore.getDebugSkill());
		preparedStmt.setString(7, candidateScore.getProblemscore());
		preparedStmt.setString(8, candidateScore.getStatus());

		// execute the preparedstatement
		preparedStmt.executeUpdate();
		preparedStmt.close();

	} catch (SQLException e) {

		System.out.println(e.getMessage());
		return false;

	}

	finally {

		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				try {
					throw new Exception(e.getMessage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				return false;
			}

	}

	return true;

}

public CandidateScore getCandidateStaus(String candidateName){
	
	
	CandidateScore candidateScore = new CandidateScore();
	
	Connection connection = null;	
	ResultSet rs = null;
	try {
		connection = ConnectionUtil.getConnection();
		String query = "select * from INTERVIEWER_TRACK where CANDIDATE_NAME=?";	
				 
		 PreparedStatement preparedStatement = connection
                 .prepareStatement(query);
         preparedStatement.setString(1, candidateName);
         
         rs = preparedStatement.executeQuery();
         while (rs.next()) {
        	 
        	 candidateScore.setCandidateName(rs.getString("CANDIDATE_NAME"));
        	 candidateScore.setRounds(rs.getString("ROUND_NAME"));
        	 candidateScore.setStatus(rs.getString("STATUS"));
         }
		 
	} catch (SQLException e) {
		System.out.println(e.getMessage());	

	}
	finally {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				try {
					throw new Exception(e.getMessage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				
			}
	}		
	
	return candidateScore;
	
	
}


}

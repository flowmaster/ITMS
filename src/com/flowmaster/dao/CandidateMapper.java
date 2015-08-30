package com.flowmaster.dao;

import com.flowmaster.model.Candidate;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CandidateMapper implements RowMapper<Candidate> {
	   public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Candidate Candidate = new Candidate();
	      /*Candidate.setCandidateId(rs.getInt("id"));*/
	      /*Candidate.setCanditatName(rs.getString("name"));*/
	      return Candidate;
	   }
}

package com.flowmaster.model;

public class CandidateScore {
	private String candidateName;
	private String interviewer;
	private String java;
	private String sql;
	private String debugSkill;
	private String problemscore;
	
	public String getProblemscore() {
		return problemscore;
	}
	public void setProblemscore(String problemscore) {
		this.problemscore = problemscore;
	}
	private String rounds;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public String getDebugSkill() {
		return debugSkill;
	}
	public void setDebugSkill(String debugSkill) {
		this.debugSkill = debugSkill;
	}
	
	
	public String getRounds() {
		return rounds;
	}
	public void setRounds(String rounds) {
		this.rounds = rounds;
	}	

}

package com.flowmaster.model;

import java.util.ArrayList;

public class Interviewer {
	private ArrayList<String> candidateName = new ArrayList<String>();
	private String interviewer;

	public ArrayList<String> getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(ArrayList<String> candidateName) {
		this.candidateName = candidateName;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}

}

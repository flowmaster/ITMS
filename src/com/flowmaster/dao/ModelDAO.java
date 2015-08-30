/*package com.flowmaster.dao;

import java.util.ArrayList;

import com.flowmaster.model.Candidate;

public class ModelDAO {
	private static ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
	private Candidate info = new Candidate();

	public void prepareCandidateInfo(Candidate details) {
		info.setCandidateName(details.getCandidateName());
		info.setExperience(details.getExperience());
		info.setInterviewer(details.getInterviewer());
		info.setJobId(details.getJobId());
		info.setSkilSet(details.getSkilSet());
		candidateList.add(info);
		
		System.out.println(candidateList.size());
	}

	public ArrayList<Candidate> getCandidateList() {
		return candidateList;
	}

	public void setCandidateList(ArrayList<Candidate> candidateList) {
		this.candidateList = candidateList;
	}
	
}
*/
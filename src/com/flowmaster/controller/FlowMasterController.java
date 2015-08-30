package com.flowmaster.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flowmaster.dao.AllDao;
import com.flowmaster.dao.LoginDao;

import com.flowmaster.model.Candidate;
import com.flowmaster.model.CandidateScore;
import com.flowmaster.model.LoginUser;

@Controller
public class FlowMasterController {

	

	LoginDao loginDao;

	LoginUser loginUser;
	
	AllDao modelDao = new AllDao();

	@Autowired
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Autowired
	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String loginCheck(@RequestParam(value = "nameValue") String name,
			@RequestParam(value = "password") String password, ModelMap model) {

		System.out.println("Inside Controller");
		String result = "";
		boolean validLogin = false;
		validLogin = loginDao.isvalidLogin(name, password);
		if (validLogin) {
			model.addAttribute("userName", name);
			result = "homepage";
		} else {
			result = "loginFailure";
		}

		return result;
	}

	@RequestMapping(value = "addnewcandidate.html", method = RequestMethod.GET)
	public String getHrCorner(Map<String,List<String>> objectMap) {
		
		List<String> interviewList = modelDao.getAllInterviewer();
		
		System.out.println("Candidate List Size " +interviewList.size());
		
		for (String name : interviewList) {
			
			System.out.println(name);
		}
		
		objectMap.put("interviewerList",interviewList);
		
		

		String result = "addnewcandidate";

		return result;
	}

	@RequestMapping(value = "/intresult", method = RequestMethod.GET)
	public String evaluateCandidate() {

		String result = "evaluatecandidate";

		return result;
	}

	@RequestMapping(value = "assigninterviewer.html", method = RequestMethod.GET)
	public String assignInterviewer() {

		String result = "assigninterviewer";

		return result;
	}

	@RequestMapping(value = "interviewerhome.html", method = RequestMethod.GET)
	public String interviewerHome(Map<String,List<String>> objectMap) {

		List<String> interviewList = modelDao.getAllInterviewer();
		
		System.out.println("Candidate List Size " +interviewList.size());
		
		for (String name : interviewList) {
			
			System.out.println(name);
		}
		
		objectMap.put("interviewerList",interviewList);
		
		String result = "interviewerhome";

		return result;
	}
	
	@RequestMapping(value = "candidatehome.html", method = RequestMethod.GET)
	public String candidatedetailhome(Map<String,List<String>> objectMap) {
		
		List<String> candidateList = modelDao.getAllCandidate();
		
		System.out.println("Candidate List Size " +candidateList.size());
		
		for (String name : candidateList) {
			
			System.out.println(name);
		}
		
		objectMap.put("candidateList",candidateList);
    
		String result = "candiddetailhome";

		return result;
	}
	
	@RequestMapping(value = "/addnewcandidate", method = RequestMethod.POST)
	public String getCandidateFullDetails(@RequestParam(value="candidateName")String candidateName, @RequestParam(value="experience")String experience,
			@RequestParam(value="jobid")String jobId,@RequestParam(value="interviewerName")String interviewerName,@RequestParam(value="skillset")String skillset,
			@RequestParam(value="roundname")String roundName,ModelMap model) {
		
		Candidate candidate = new Candidate();
		
		candidate.setCandidateName(candidateName);
		candidate.setExperience(experience);
		candidate.setJobId(jobId);
		candidate.setInterviewer(interviewerName);
		candidate.setSkillSet(skillset);
		candidate.setRoundName(roundName);
		modelDao.insertCandidate(candidate);
		
		model.addAttribute("name", candidateName);
				
		String result = "addcandidatesuccess";

		return result;
	}
	
	@RequestMapping(value = "/getinterviewerdetails", method = RequestMethod.POST)
	public String getInterviewerFullDetails(@RequestParam(value="interviewerName")String interviewerName,
			Map<String,String> modelMap, Map<String,List<String>> objectMap) {
		
	List<String> candidateList = modelDao.getAllCandidatesForInterviewer(interviewerName);
		
	modelMap.put("interviewername", interviewerName);
	objectMap.put("candidatelist", candidateList);
				
		String result = "interviewerhomedetail";

		return result;
	}
	
	
	@RequestMapping(value = "/assignnextround", method = RequestMethod.POST)
	public String assigntoNextRound(@RequestParam(value="candidatename")String candidateName,
			@RequestParam(value="interviewername")String interviewerName) {

				
		String result = "candidfulldetail";

		return result;
	}
	
	@RequestMapping(value = "/rejectcandidate", method = RequestMethod.POST)
	public String rejectCandidate(@RequestParam(value="candidatename")String candidateName) {

		String result = "candidfulldetail";

		return result;
	}
	
	@RequestMapping(value = "/selectcandidate", method = RequestMethod.POST)
	public String getCandidateFullDetails(@RequestParam(value="candidatename")String candidateName) {

		String result = "candidfulldetail";

		return result;
	}
	
	@RequestMapping(value = "/interviewerscoreSheet", method = RequestMethod.POST)
	public String interviewScoreSheet(@RequestParam(value="candidatename")String candidateName,
			@RequestParam(value="interviewername")String interviewerName,
			@RequestParam(value="javascore")String javaScore,
			@RequestParam(value="sqlscore")String sqlScore,
			@RequestParam(value="debugscore")String debugScore,
			@RequestParam(value="problemscore")String problemScore,
			@RequestParam(value="status")String status,
			@RequestParam(value="round")String round,
			Map<String,String> map) {

		CandidateScore candidateScore = new CandidateScore();
		
		candidateScore.setInterviewer(interviewerName);
		candidateScore.setCandidateName(candidateName);
		candidateScore.setJava(javaScore);
		candidateScore.setDebugSkill(debugScore);
		candidateScore.setRounds(round);
		candidateScore.setStatus(status);
		candidateScore.setSql(sqlScore);
		candidateScore.setProblemscore(problemScore);
		
		boolean inserted = modelDao.insertInterviewResult(candidateScore);
		
		map.put("name", candidateName);
		
		String result = "scoreinsertsuccess";

		return result;
	}
	
	@RequestMapping(value = "interviewscore", method = RequestMethod.POST)
	public String putScore(@RequestParam(value="candidateName")String candidateName,
			@RequestParam(value="interviewerName")String interviewerName,Map<String,String> objectMap) {
						
		System.out.println("Interviewer Name " +interviewerName);
		
		System.out.println("Candidate Name " +candidateName);
			
		
		objectMap.put("interviewername",interviewerName);
		
		objectMap.put("candidateName",candidateName);
		
		

		String result = "evaluatecandidate";

		return result;
	}
	
	@RequestMapping(value = "getcandidstatus", method = RequestMethod.POST)
	public String putScore(@RequestParam(value="candidatename")String candidateName,
			Map<String,CandidateScore> modelMap) {					
		
		
		CandidateScore candidaetScore = modelDao.getCandidateStaus(candidateName);		
		
		modelMap.put("candidaetstatus",candidaetScore);		

		String result = "candidfulldetail";

		return result;
	}
	

	
	

}

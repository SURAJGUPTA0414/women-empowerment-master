package com.capgemini.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.model.FeedBack;
import com.capgemini.repository.IFeedBackDao;



public class FeedBackService  implements IFeedBackService{
	
	private static final Logger LOG = LoggerFactory.getLogger(FeedBackService.class);
	 
	@Autowired
	private IFeedBackDao ifeedbackdao;
	@Override
	public List<FeedBack> viewAllFeedBack() {
		System.out.println("Service getAllEmployees");
		return ifeedbackdao.findAll();
	}
	@Override
	public FeedBack addFeedBack(FeedBack feedback) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FeedBack updateFeedBack(FeedBack feedback) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FeedBack viewFeedBack(int feedbackId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<FeedBack> viewFeedBackBySchemeName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<FeedBack> viewFeedBackByTrainingCourseName() {
		// TODO Auto-generated method stub
		return null;
	}


}

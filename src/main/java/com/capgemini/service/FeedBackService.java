package com.capgemini.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.model.FeedBack;
import com.capgemini.repository.IFeedBackRepository;




public class FeedBackService implements IFeedBackService{
	
	private static final Logger LOG = LoggerFactory.getLogger(FeedBackService.class);
	 
	@Autowired
	private IFeedBackRepository ifeedbackrepository;
	@Override
	public List<FeedBack> viewAllFeedBack() {
		System.out.println("Service getAllEmployees");
		return ifeedbackrepository.findAll();
	}
	@Override
	public FeedBack addFeedBack(FeedBack feedback) {
		// TODO Auto-generated method stub
		return ifeedbackrepository.save(feedback);
	}
	@Override
	public FeedBack updateFeedBack(FeedBack feedback) {
			if (ifeedbackrepository.existsById(feedback.getFeedBackId())) {
				return ifeedbackrepository.save(feedback);
			} else {
//				throw new NGONotFoundException(ngo.getNgoId()+" this employee is not found.");
			}
			return feedback;
		}
		
	
	@Override
	public FeedBack viewFeedBack(int feedbackId) {
		// TODO Auto-generated method stub
		return ifeedbackrepository.viewFeedBack(feedbackId);
	}
	@Override
	public List<FeedBack> viewFeedBackBySchemeName() {
		// TODO Auto-generated method stub
		return ifeedbackrepository.viewFeedBackBySchemeName();
	}
	@Override
	public List<FeedBack> viewFeedBackByTrainingCourseName() {
		// TODO Auto-generated method stub
		return ifeedbackrepository.viewFeedBackByTrainingCourseName();
	}


}

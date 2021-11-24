package com.capgemini.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.FeedBackNotFoundException;
import com.capgemini.exception.InvalidFieldException;
import com.capgemini.model.FeedBack;
import com.capgemini.service.FeedBackService;
import com.capgemini.service.IFeedBackService;


// This is a comment.  

//@Component
@RestController
public class FeedbackController {

	private static final Logger LOG = LoggerFactory.getLogger(FeedbackController.class);

	@Autowired
	private IFeedBackService feedbackService;
//	public ResponseEntity<Trainee>
	@PostMapping(path = "/feedback")
	public ResponseEntity<FeedBack> addFeedBack(@RequestBody FeedBack course)
			throws  FeedBackNotFoundException {
		ResponseEntity<FeedBack> response = null;
		FeedBack f = feedbackService.addFeedBack(course);
		System.out.println("FeedBack add");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "FeedBack added to database");
		response = new ResponseEntity<FeedBack>(f, headers, HttpStatus.CREATED);
		return response;
	}
	
	// http://localhost:8082/updateempfeedback
		@PutMapping("/updatefeedback")
		public ResponseEntity<FeedBack> updateFeedBack(@RequestBody FeedBack feedback) {
			LOG.info("updateTrainee");
			FeedBack updateFeedBack = feedbackService.updateFeedBack(feedback);
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", ""+ feedback +" updated successfully");
			LOG.info(headers.toString());
			ResponseEntity<FeedBack> response = new ResponseEntity<FeedBack>(updateFeedBack, headers, HttpStatus.OK);
			return response;
		}
	
		@GetMapping("/viewfeedbackByfeedbackId")
		public ResponseEntity<FeedBack> viewFeedBack(int feedbackId) {
			LOG.info("viewTraineeByCourseId");
			FeedBack viewfeedbackByfeedbackId= feedbackService.viewFeedBack(feedbackId);
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "feedback with "+ feedbackId + " retrived successfully from the database");
			LOG.info(headers.toString());
			ResponseEntity<FeedBack> response = new ResponseEntity<FeedBack>(viewfeedbackByfeedbackId, headers, HttpStatus.OK);
			return response;
		}

		@GetMapping("/viewFeedBackBySchemeName")
		public ResponseEntity<List<FeedBack>> viewFeedBackBySchemeName(String SchemeName) {
			LOG.info("viewTraineeByCourseId");
			List<FeedBack> viewFeedBackBySchemeName= feedbackService.viewFeedBackBySchemeName();
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "Data of feedback with "+ SchemeName + " retrived successfully from the database");
			LOG.info(headers.toString());
			ResponseEntity<List<FeedBack>> response = new ResponseEntity<List<FeedBack>>(viewFeedBackBySchemeName, headers, HttpStatus.OK);
			return response;
		}
		
		@GetMapping("/viewFeedBackByTrainingCourseName")
		public ResponseEntity<List<FeedBack>> viewFeedBackByTrainingCourseName(String TrainingCourseName) {
			LOG.info("viewTraineeByCourseId");
			List<FeedBack> viewTraineeByFeedBack= feedbackService.viewFeedBackByTrainingCourseName();
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "Data of feedback with "+ TrainingCourseName + " retrived successfully from the database");
			LOG.info(headers.toString());
			ResponseEntity<List<FeedBack>> response = new ResponseEntity<>(viewTraineeByFeedBack, headers, HttpStatus.OK);
			return response;
		}

	@GetMapping("/viewAllfeedback")
	public ResponseEntity<List<FeedBack>> viewAllFeedBack() 
	{
		LOG.info("viewAllTraineesByLocation");
		List<FeedBack> viewAllFeedBacks=feedbackService.viewAllFeedBack();
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "All feedback data retrieved successfully from the database.");
		LOG.info(headers.toString());
		ResponseEntity<List<FeedBack>> response = new ResponseEntity<>(viewAllFeedBacks, headers, HttpStatus.OK);
		return response; 
	}


	

	
	@GetMapping("/viewFeedBackByTrainingCourseName")
	public ResponseEntity<FeedBack> viewFeedBack(String TrainingCourseName) {
		LOG.info("viewTraineeByCourseId");
		FeedBack viewTraineeByFeedBack= feedbackService.viewFeedBackByTrainingCourseName();
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Data of feedback with "+ TrainingCourseName + " retrived successfully from the database");
		LOG.info(headers.toString());
		ResponseEntity<FeedBack> response = new ResponseEntity<FeedBack>(viewTraineeByFeedBack, headers, HttpStatus.OK);
		return response;
	}
	
	
	

}

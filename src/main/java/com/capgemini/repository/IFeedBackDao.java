package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.FeedBack;



public interface IFeedBackDao extends JpaRepository<FeedBack, Integer>{
	FeedBack addFeedBack(FeedBack feedback);

	FeedBack updateFeedBack(FeedBack feedback);

	FeedBack viewFeedBack(int feedbackId);

	List<FeedBack> viewAllFeedBack();

	List<FeedBack> viewFeedBackBySchemeName();

	List<FeedBack> viewFeedBackByTrainingCourseName();
}

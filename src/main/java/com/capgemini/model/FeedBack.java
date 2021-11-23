package com.capgemini.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="feedback_table")
public class FeedBack {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
	private int feedBackId;
	
	@Column
	private int schemeRating;
	
	@Column
	private int schemeTrainingRating;
	
	@Column
	private int overallRating;
	
	@Column
	private String comments;
	
	@Column
	private	LocalDate feedbackdate;
	
	@Column
	private User user;
	
	@Column
	private TrainingCourse training;
	
	@Column
	private Scheme scheme;
	

	
	public FeedBack() {
		super();
		
	}

	public FeedBack(int feedBackId, int schemeRating, int schemeTrainingRating, int overallRating, String comments,
			LocalDate feedbackdate, User user, TrainingCourse training, Scheme scheme) {
		super();
		this.feedBackId = feedBackId;
		this.schemeRating = schemeRating;
		this.schemeTrainingRating = schemeTrainingRating;
		this.overallRating = overallRating;
		this.comments = comments;
		this.feedbackdate = feedbackdate;
		this.user = user;
		this.training = training;
		this.scheme = scheme;
		
		
	}

	public int getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}

	public int getSchemeRating() {
		return schemeRating;
	}

	public void setSchemeRating(int schemeRating) {
		this.schemeRating = schemeRating;
	}

	public int getSchemeTrainingRating() {
		return schemeTrainingRating;
	}

	public void setSchemeTrainingRating(int schemeTrainingRating) {
		this.schemeTrainingRating = schemeTrainingRating;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}

	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TrainingCourse getTraining() {
		return training;
	}

	public void setTraining(TrainingCourse training) {
		this.training = training;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	@Override
	public String toString() {
		return "FeedBack [feedBackId=" + feedBackId + ", schemeRating=" + schemeRating + ", schemeTrainingRating="
				+ schemeTrainingRating + ", overallRating=" + overallRating + ", comments=" + comments
				+ ", feedbackdate=" + feedbackdate + ", user=" + user + ", training=" + training + ", scheme=" + scheme
				+ "]";
	}
	
}
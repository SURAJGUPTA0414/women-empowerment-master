package com.capgemini.model;

public class NGO {
	private Integer ngoId;
	private String ngoName;
	private String ngoLocation;
	private String ngoType;
	private String ngoMotive;
	private double donation;
	private int ngoSize;
	private String ngoActivities;
	private TrainingCourse trainingCourse;
	public NGO() {
		super();
	}
	public NGO(Integer ngoId, String ngoName, String ngoLocation, String ngoType, String ngoMotive, double donation,
			int ngoSize, String ngoActivities, TrainingCourse trainingCourse) {
		super();
		this.ngoId = ngoId;
		this.ngoName = ngoName;
		this.ngoLocation = ngoLocation;
		this.ngoType = ngoType;
		this.ngoMotive = ngoMotive;
		this.donation = donation;
		this.ngoSize = ngoSize;
		this.ngoActivities = ngoActivities;
		this.trainingCourse = trainingCourse;
	}
	public Integer getNgoId() {
		return ngoId;
	}
	public void setNgoId(Integer ngoId) {
		this.ngoId = ngoId;
	}
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public String getNgoLocation() {
		return ngoLocation;
	}
	public void setNgoLocation(String ngoLocation) {
		this.ngoLocation = ngoLocation;
	}
	public String getNgoType() {
		return ngoType;
	}
	public void setNgoType(String ngoType) {
		this.ngoType = ngoType;
	}
	public String getNgoMotive() {
		return ngoMotive;
	}
	public void setNgoMotive(String ngoMotive) {
		this.ngoMotive = ngoMotive;
	}
	public double getDonation() {
		return donation;
	}
	public void setDonation(double donation) {
		this.donation = donation;
	}
	public int getNgoSize() {
		return ngoSize;
	}
	public void setNgoSize(int ngoSize) {
		this.ngoSize = ngoSize;
	}
	public String getNgoActivities() {
		return ngoActivities;
	}
	public void setNgoActivities(String ngoActivities) {
		this.ngoActivities = ngoActivities;
	}
	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}
	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
	@Override
	public String toString() {
		return "NGO [ngoId=" + ngoId + ", ngoName=" + ngoName + ", ngoLocation=" + ngoLocation + ", ngoType=" + ngoType
				+ ", ngoMotive=" + ngoMotive + ", donation=" + donation + ", ngoSize=" + ngoSize + ", ngoActivities="
				+ ngoActivities + ", trainingCourse=" + trainingCourse + "]";
	}
	
}

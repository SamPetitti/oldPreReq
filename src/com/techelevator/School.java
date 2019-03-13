package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

	private String schoolName;
	private String applicationDeadline;
	private String  tuition;
	private int minGreMath;
	private int minGreVerbal;
	private int minGreWriting;
	private int amountOfRecommendationsNeeded;
	private double minUndergraduateGpa;
	private boolean summerOption;
	private boolean CV;
	private boolean interview;
	private List<String> transcriptsNeeded = new ArrayList<String>();
	private Map<String, String> preReqsRequired = new HashMap <String, String>();
	
	public School(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}


	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	/**
	 * @return the applicationDeadline
	 */
	public String getApplicationDeadline() {
		return applicationDeadline;
	}


	/**
	 * @param applicationDeadline the applicationDeadline to set
	 */
	public void setApplicationDeadline(String applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}


	/**
	 * @return the tuition
	 */
	public String getTuition() {
		return tuition;
	}


	/**
	 * @param tuition the tuition to set
	 */
	public void setTuition(String tuition) {
		this.tuition = tuition;
	}


	/**
	 * @return the minGreMath
	 */
	public int getMinGreMath() {
		return minGreMath;
	}


	/**
	 * @param minGreMath the minGreMath to set
	 */
	public void setMinGreMath(int minGreMath) {
		this.minGreMath = minGreMath;
	}


	/**
	 * @return the minGreVerbal
	 */
	public int getMinGreVerbal() {
		return minGreVerbal;
	}


	/**
	 * @param minGreVerbal the minGreVerbal to set
	 */
	public void setMinGreVerbal(int minGreVerbal) {
		this.minGreVerbal = minGreVerbal;
	}


	/**
	 * @return the minGreWriting
	 */
	public int getMinGreWriting() {
		return minGreWriting;
	}


	/**
	 * @param minGreWriting the minGreWriting to set
	 */
	public void setMinGreWriting(int minGreWriting) {
		this.minGreWriting = minGreWriting;
	}


	/**
	 * @return the amountOfRecommendationsNeeded
	 */
	public int getAmountOfRecommendationsNeeded() {
		return amountOfRecommendationsNeeded;
	}


	/**
	 * @param amountOfRecommendationsNeeded the amountOfRecommendationsNeeded to set
	 */
	public void setAmountOfRecommendationsNeeded(int amountOfRecommendationsNeeded) {
		this.amountOfRecommendationsNeeded = amountOfRecommendationsNeeded;
	}


	/**
	 * @return the minUndergraduateGpa
	 */
	public double getMinUndergraduateGpa() {
		return minUndergraduateGpa;
	}


	/**
	 * @param minUndergraduateGpa the minUndergraduateGpa to set
	 */
	public void setMinUndergraduateGpa(double minUndergraduateGpa) {
		this.minUndergraduateGpa = minUndergraduateGpa;
	}


	/**
	 * @return the summerOption
	 */
	public boolean isSummerOption() {
		return summerOption;
	}


	/**
	 * @param summerOption the summerOption to set
	 */
	public void setSummerOption(boolean summerOption) {
		this.summerOption = summerOption;
	}


	/**
	 * @return the cV
	 */
	public boolean isCV() {
		return CV;
	}


	/**
	 * @param cV the cV to set
	 */
	public void setCV(boolean cV) {
		CV = cV;
	}


	/**
	 * @return the interview
	 */
	public boolean isInterview() {
		return interview;
	}


	/**
	 * @param interview the interview to set
	 */
	public void setInterview(boolean interview) {
		this.interview = interview;
	}
}
package com.techelevator;


import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class Student {
		
		private String studentName; // last name/firstname/ m.i.
		private String firstName;
		private String lastName;
		private String middleInit;
		private String degree;
		private int greVerbal;
		private int greMath;
		private int greWriting;
		private double underGraduateGpa;
		private List <School> schoolList = new ArrayList <School>();
		private List <String> preReqsTaken = new ArrayList <String>();
		private List<String> recLettersInHand = new ArrayList<String>();
		private List<String> transcriptsInHand = new ArrayList<String>();
		
		
		
//		public Student(String firstName, String lastName, String middleInit) {
//			this.firstName = firstName;
//			this.lastName = lastName;
//			this.middleInit = middleInit;
//			
//		}
		

		public Student() {
			
		}


		public Student(String first, String last, String middle) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.middleInit = middleInit;
		}













		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}



		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}



		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		/**
		 * @return the middleInit
		 */
		public String getMiddleInit() {
			return middleInit;
		}



		/**
		 * @param middleInit the middleInit to set
		 */
		public void setMiddleInit(String middleInit) {
			this.middleInit = middleInit;
		}



		/**
		 * @return the degree
		 */
		public String getDegree() {
			return degree;
		}

		/**
		 * @param degree the degree to set
		 */
		public void setDegree(String degree) {
			this.degree = degree;
		}


		/**
		 * @return the greVerbal
		 */
		public int getGreVerbal() {
			return greVerbal;
		}



		/**
		 * @param greVerbal the greVerbal to set
		 */
		public void setGreVerbal(int greVerbal) {
			this.greVerbal = greVerbal;
		}



		/**
		 * @return the greMath
		 */
		public int getGreMath() {
			return greMath;
		}



		/**
		 * @param greMath the greMath to set
		 */
		public void setGreMath(int greMath) {
			this.greMath = greMath;
		}



		/**
		 * @return the greWriting
		 */
		public int getGreWriting() {
			return greWriting;
		}



		/**
		 * @param greWriting the greWriting to set
		 */
		public void setGreWriting(int greWriting) {
			this.greWriting = greWriting;
		}



		/**
		 * @return the underGraduateGpa
		 */
		public double getUnderGraduateGpa() {
			return underGraduateGpa;
		}



		/**
		 * @param underGraduateGpa the underGraduateGpa to set
		 */
		public void setUnderGraduateGpa(double underGraduateGpa) {
			this.underGraduateGpa = underGraduateGpa;
		}


		
		
		public void addSchoolToList(School school) {
			schoolList.add(school);
		}
		
		/**
		 * @return the studentSchoolList
		 */
		
		public List<School> getSchoolList(){
			return schoolList;
		}
		
		
		/**
		 * @return the preReqsTaken
		 */
		public List<String> getPreReqsTaken() {
			return preReqsTaken;
		}

		

		/**
		 * @return the recLettersInHand
		 */
		public List<String> getRecLettersInHand() {
		return recLettersInHand;
		}


		/**
		 * @return the transcriptsInHand
		 */
		public List<String> getTranscriptsInHand() {
			return transcriptsInHand;
		}
		
		
		//METHODS
		public void printSchoolList() {
			for(School school : schoolList) {
				System.out.println(school.getSchoolName());
			}
		}
		
		
		
		//add method for adding recLettersInHand
		public void addRecLetterInHand(String recommender) {
			recLettersInHand.add(recommender + " In-Hand");
		}
		
		//add method for adding transcriptsInHand
		public void addTranscriptsInHand(String transcript) {
			 {transcriptsInHand.add(transcript);
			} 
			
		}
		public void addPreReqsTaken(String preReq) {
			preReqsTaken.add(preReq);
		
		}
		
		//test method
		
		public void printGre() {
			System.out.println("Your GRE scores are: " + this.getGreMath());
			System.out.println(this.getGreVerbal());
			System.out.println(this.getGreWriting());
			
		}
	
	}
		




package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;


public class AppApp {
	
	//*** ADD TO PRE REQ APP AND WRITE METHODS ******** 
	Scanner keyBoard = new Scanner(System.in);	
	public Student student = new Student();
	public School  school = null;
	
//********************************Create new Student ******************************************
	
	public void newStudent() {
		System.out.println("Please enter your firstName");
		String first = keyBoard.nextLine();
		
		System.out.println("Please enter your lastName");
		String last = keyBoard.nextLine();
		
		System.out.println("Please enter your  middleInitial");
		String middle = keyBoard.nextLine();
		
		student.setFirstName(first);
		student.setMiddleInit(middle);
		student.setLastName(last);
	
	}
	
//*************************************Enter Student GRE ******************************************
	
	   public void enterGRE() {
		
		System.out.println("Please enter your GRE verbal score. If you have not taken, please enter 0");
		String greVerbal = keyBoard.nextLine();
		int greVerbalToInt = Integer.parseInt(greVerbal);
		student.setGreVerbal(greVerbalToInt);
		
		System.out.println("Please enter your GRE math score. If you have not taken, please enter 0");
		String greMath = keyBoard.nextLine();
		int greMathToInt = Integer.parseInt(greMath);
		student.setGreMath(greMathToInt);
		
		System.out.println("Please enter your GRE writing score. If you have not taken, please enter 0");
		String greWriting= keyBoard.nextLine();
		int greWritingToInt = Integer.parseInt(greWriting);
		student.setGreWriting(greWritingToInt);
	   
	   }
		


						
//*************************************Enter GPA ******************************************	
	   
	   public void enterGPA() {
		System.out.println("Please enter your Undergraduate GPA");
		String undergradGpa= keyBoard.nextLine();
		double undergradGpaToDouble = Double.parseDouble(undergradGpa);
		student.setUnderGraduateGpa(undergradGpaToDouble);
	   }
		
//*************************************Enter pre-reqs******************************************		
	   public void enterPreReqsTaken() {
		System.out.println("Please enter all pre-requisite courses taken (seperated by commas");
		String preReqsTaken = keyBoard.nextLine();
		String [] preReqsTakenArr = preReqsTaken.split(", ");
		for(int i = 0; i < preReqsTakenArr.length; i++) {
			student.addPreReqsTaken(preReqsTakenArr[i]);
			}
		}
	  
	 //*************************************Enter req letters******************************************
	   public void enterRecommendationLetters() {
	   System.out.println("Please enter all recommendation letters (by recommender name) seperated by a comma (,)");
	   String recLetters = keyBoard.nextLine();
	   String [] recLettersSplit = recLetters.split(", ");
		for(int i = 0; i < recLettersSplit.length; i++) {
			student.addRecLetterInHand(recLettersSplit[i]);
			}
		}
	
	 //*************************************Enter  transcripts******************************************
	   public void enterTranscripts() {
	    System.out.println("Please enter all transcripts letters school name seperated by a comma (,)");
		String transcripts = keyBoard.nextLine();
		String [] transcriptsSplit = transcripts.split(", ");
		for(int i = 0; i < transcriptsSplit.length; i++) {
			student.addTranscriptsInHand(transcriptsSplit[i]);	
		}

	}
 //*************************************add school******************************************   
	   public void addNewSchool() {
		   System.out.println("Please enter the school you would like to add:");
		   String newSchool = keyBoard.nextLine();
		   school = new School(newSchool);
		   student.addSchoolToList(school);
	  }
	  
	 
	  public void enterAppDeadline() {
		   System.out.println("Please enter the application deadline:");
		   String appDeadline = keyBoard.nextLine();
		   //Doesn't like the "/"
		   school.setApplicationDeadline(appDeadline);
		   
	  }	
//*****************************************Write file******************************************
	
	public void writeNewStudent() throws IOException {
		try {
		 	String studentFile = "studentFile.txt";
		    FileWriter fw = new FileWriter(studentFile,true); //the true will append the new data
		    fw.write("Student name: " + student.getFirstName() + " " + student.getLastName() +
		    		student.getMiddleInit() + "\n");//appends the string to the file
		    fw.write("GRE Verbal: " + student.getGreVerbal() + "\n");
		    fw.write("GRE Math: " + student.getGreMath()+ "\n");
		    fw.write("GRE writing: " + student.getGreWriting()+ "\n");
		    fw.write("Undregraduate GPA: " + student.getUnderGraduateGpa()+ "\n");
		    fw.write("\n");
		    fw.write("PRE-REQS TAKEN:" + "\n" );
		    for(int i = 0; i < student.getPreReqsTaken().size(); i++) {
		    	fw.write("     " + student.getPreReqsTaken().get(i)+ "\n");
		    }
		    fw.write("\n");
		    fw.write("RECOMMENDATION LETTERS IN HAND:" + "\n");
		    for(int i = 0; i < student.getRecLettersInHand().size(); i++) {
		    	fw.write("     " + student.getRecLettersInHand().get(i) + "\n");
		    }
		    fw.write("\n");
		    fw.write("TRANSCRIPTS IN HAND:" + "\n");
		    for(int i = 0; i < student.getTranscriptsInHand().size(); i++) {
		    	fw.write("     " +student.getTranscriptsInHand().get(i)+ "\n");
		    }
	
		    fw.write("\n");
		    fw.write("\n");
		    fw.write("\n");
		    for(int i = 0; i < student.getSchoolList().size(); i++) {
		    	fw.write("Name: " +student.getSchoolList().get(i).getSchoolName());
		    	fw.write("Tuition " + student.getSchoolList().get(i).getTuition());
		    	fw.write("Deadline " + student.getSchoolList().get(i).getApplicationDeadline());
		    }
		    fw.close();
		}
		catch(IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
	
	
//CRUD create/read/update/delete
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub		
		Scanner kb = new Scanner(System.in);
		
		Menu menu = new Menu(System.in, System.out);
		AppApp preReq = new AppApp();
		preReq.newStudent();
		preReq.enterGRE();
		preReq.enterGPA();
		preReq.enterPreReqsTaken();
		preReq.enterRecommendationLetters();
		preReq.enterTranscripts();
		preReq.addNewSchool();
		preReq.enterAppDeadline();
		preReq.addNewSchool();
		preReq.enterAppDeadline();
		preReq.addNewSchool();
		preReq.enterAppDeadline();
		preReq.student.printSchoolList();
		preReq.writeNewStudent();
	}
}
		

		
		

//		CV;
//		interview;
//		private List<String> transcriptsNeeded = new ArrayList<String>();
//		private Map<String, String> preReqsRequired = new HashMap <String, String>();
//		
//		
	
		
		//add another schooL!
		
		
		
//		public void displayOptions() {
//			pleaseSelect();
//			preReqOptions();
//			String choice = kb.nextLine();
//			switch (choice) {
//	        case 1:  choice.equals("1");
//	       break;
//		}
//		public void pleaseSelect() {
//			System.out.print("Please select an option:");
//		}
//		
//		public void preReqOptions() {
//			System.out.print(
//					"1) Student name +  \n" +
//					"2)  Student GRE  + \n" +
//					"4)  Pre-Reqs Take+ \n" +
//					"5)  Req-Letters  + \n" +
//					"6)  Transcripts  + \n" +
//					"7)  Add school   + \n" );		
			
	


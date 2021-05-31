package com.computerAided;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAided{
	private static int answer;
	private static int guess;
	public static int score ;
	public  final static int NUMBEROFTIME = 10;
	public static double percentage;
	private static int levelOfDeficultLevel;
	
	
	
	static SecureRandom rand = new SecureRandom();
	static Scanner input;
	private static int problemType;
	
	
//	public static void howManyQuestion() {
//		
//	}
	public static void displayproblemType() {
		String messege ="1 for Addition\n2 for substraction\n3 for multiplication\n4 for divisor\n5 for mix problem";
		System.out.print(messege);
	}
	public static void selectProblemType() {
		input = new Scanner(System.in);
		problemType = input.nextInt();
	}
	public static void difficultLevel() {
		input = new Scanner(System.in);
		System.out.print("Enter your level");
		levelOfDeficultLevel = input.nextInt();
		
	}
	
	public static void multiplication() {
//		input = new Scanner(System.in);
		
		int numberOne = 1 + rand.nextInt(9);
		int numberTwo = 1 + rand.nextInt(9);
		answer = numberOne * numberTwo;
//		numberOfQuestion = input.nextInt();
		System.out.println("what is " +numberOne + " * "+numberTwo);
				
	}
	public static void doubleMultiplication() {
		int numberOne = 10 + rand.nextInt(9);
		int numberTwo = 10 + rand.nextInt(9);
		answer = numberOne * numberTwo;
//		numberOfQuestion = input.nextInt();
		System.out.println("what is " +numberOne + " * "+numberTwo);	
		
	}
	public static void decidingDeficulty() {
		if(levelOfDeficultLevel == 1) {
			multiplication();
		}else if(levelOfDeficultLevel==2) {
			doubleMultiplication();
		}
	}
	public static void askquestion() {
		
		System.out.println("What is your answer");
		input = new Scanner(System.in);
		guess = input.nextInt();
	}
	
	public static void correctResponse() {
		int number = 1 + rand.nextInt(4);
		switch(number) {
		case 1:
			System.out.println("Very Good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice Work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
			
		}
		
	}
	
	public static void wrongResponse() {
		int number = 1 + rand.nextInt(4);
		switch(number) {
		case 1:
			System.out.println("No. Please try again!");
			break;
		case 2:
			System.out.println("Wrong. Try once more!");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.!");
			break;
			
		}
		
	}

	public static void checkAnswer() {
		if(answer == guess) {
			correctResponse();
			score++;
		}else {
			wrongResponse();
		}
		
	}
	public static void grade() {
		
		System.out.println("your score is " + score);
	}
	public static double percentageCalculation() {
		percentage = ((double)score/NUMBEROFTIME) * 100;
		System.out.println("your score percentage is %" + percentage);
		return percentage;
	}
	
	public static String message() {
		String msg;
		if(percentage > 75) {
			msg = "Congratulations, you are ready to go to the next level!";
		}else {
			msg = "Please ask your teacher for extra help .";
		}
		return msg;
	}
	
//	
////	public static void questionNumber() {
////		howManyQuestion();
	public static void main(String...args) {
		difficultLevel();
		for(int i = 1; i<=NUMBEROFTIME; i++) {
			decidingDeficulty();
			askquestion();
			checkAnswer();}
			grade();
			percentageCalculation();
			System.out.print(message());
//	}
//		percentage = ((double) score/NUMBEROFTIME) * 100;
//		System.out.println("your score percentage is " + percentage);

		
	}
	}
	
	
	
	
//	public static void main(String...args) {
//		questionNumber();}
//}
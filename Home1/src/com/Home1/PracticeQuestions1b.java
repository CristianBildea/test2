package com.Home1;

import java.util.Scanner;

public class PracticeQuestions1b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a lenght");
		double l= input.nextDouble();
		
		System.out.println("Please enter a breadth");
		double b= input.nextDouble();
		
		System.out.println("Please enter a height");
		double h= input.nextDouble();
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your choice '1' for Area, '2' for Volume, '3' for Surface Area,"
				+ "or '0' for exit");
		String choice = scan.nextLine();
		double area = l * b;
		double volume = l * b * h;
		double surfacearea = 2 * (l*b + l*h + b*h);
		switch(choice){
		case "1":
			System.out.println("Calculate area "+area);
			break;
		case "2":
			System.out.println("Calculate volume "+volume);
			break;
		case "3":
			System.out.println("Calculate surface area "+surfacearea);
			break;
		case "0":
			System.out.println("Exit the program");
			break;
			default:
				System.out.println("ERROR: Invalid choice");
				break;
		}
		
		
		
				
	}

}

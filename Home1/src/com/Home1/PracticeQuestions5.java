package com.Home1;

import java.util.Scanner;

public class PracticeQuestions5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 'U' for sunday, 'M' for monday, 'T' for tuesday, 'W' for wednesday,"
				+ "'R' for thursday, 'F' for friday and 'S' for saturday");
		String choice = input.nextLine().toUpperCase();
		switch(choice){
		case "U":
		case "S":
			System.out.println("Stay in Home");
			break;
		case "M":
		case "T":
		case "W":
		case "R":
		case "F":
			System.out.println("Go to Work");
			break;
			default:
				System.out.println("ERROR!");
				break;
		}
		

	}

}

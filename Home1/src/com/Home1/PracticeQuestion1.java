package com.Home1;

import java.util.Scanner;

public class PracticeQuestion1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter '1' for calculate area, '2' for calculate volume,"
				+ " '3' for calculate surface area and '0' for exit the program");
		String choice = input.nextLine();
		switch(choice){
		case "1":
			System.out.println("Area= length  * breadth");
			break;
		case "2":
			System.out.println("Volume= lenght * breadth * height");
			break;
		case "3":
			System.out.println("Surface Area= 2 (l*b + l*h + b*h)");
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

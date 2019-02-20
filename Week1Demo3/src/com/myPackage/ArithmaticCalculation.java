package com.myPackage;

import java.util.Scanner;

public class ArithmaticCalculation {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);	
	System.out.print("Please enter a number: ");
	double num1 = input.nextDouble();
	
	System.out.print("Please enter another number: ");
	double num2 = input.nextDouble();
	double sum = num1+num2;
	
	double diff = num1-num2;
	double product = num1*num2;
	double divide = num1/num2;
	

	System.out.println("The sum of two number is:" + sum + " The diff. is " + diff + " The product is "+ product + " The division is "+ divide);
	//System.out.printf(format, args)
	}

}

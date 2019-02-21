package com.Home1;

import java.util.Scanner;

public class PracticeQuestions4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Please enter your IQ:");
        double IQ = input.nextDouble();
        if(IQ<0 || IQ>200) {
        	System.out.println("Invalid IQ number!");
        }
        else if(IQ>100){
        	System.out.println("above average");
        }
        else if(IQ==100){
        	System.out.println("average");
        }
        else if(IQ<100){
        	System.out.println("below average");       	
        }
        else{
        	System.out.println("Error!");
        }
    
	}

}

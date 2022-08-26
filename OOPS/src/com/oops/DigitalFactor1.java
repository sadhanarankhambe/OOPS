package com.oops;

import java.util.Scanner;

public class DigitalFactor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
        int n = sc. nextLine();
        while (n!=0) {
        	int d = n % 10;
        	n /= 10;
        			int f =1;
        	for(int i = 1; i <=d; i++) {
        	f *=i;
        	
        	}
        	System.out.println("Factorial of " + d +"="+f);
        }
        
	}

}

//Program: Sum of an Integer Program 
//File: AddingTheSumOfAnInteger.java
//Summary: Calculates the sum of a five digit integer
//Author: Brennan M. Schwamb
//Date: September 14, 2018

import java.util.Scanner;
 
public class AddingTheSumOfAnInteger{
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Reminder, Sum = 0;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
		System.out.format("Sum of the digits of Given Number = %d", Sum);
	}
}
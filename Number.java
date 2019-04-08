/**
name:   Number.java
Description: Write a program named Number.java, which prompts a user to enter a number. Check if that
number is positive, negative or zero:
- If it is positive, print out a message stating it is a positive number
- If it is negative, print out a message stating it is a negative number
- If it is zero, print out a message stating it is zero
The solution for this exercise must be implemented using a cascading if/else statement.
Created By: Shannon Carson
Created On: 11/02/19
*/

import java.util.Scanner;

public class Number{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		int x;

		System.out.println("Enter Number");
		x = input.nextInt();

	    if(x < 0){
		System.out.println("The number is negative");
		}

		else if(x > 0){
		System.out.println("The number is positive");
		}

		else if (x == 0){
		System.out.println("The number is zero");
	    }

		Index.main(null);


 }
}
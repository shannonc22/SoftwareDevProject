/**
name:  BigNumber.java
Description: Write a program named BigNumber.java, which prompts a user to enter a number. Check if that
number is greater than 1,000,000. If it is then print a message to the screen stating, "That is a big
number."
Created By: Shannon Carson
Created On: 04/02/19
*/

import java.util.Scanner;

public class BigNumber{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = input.nextInt();

		if( x >= 1000000){
		System.out.println("That's a big number");
	    }
	    Index.main(null);
 }
}
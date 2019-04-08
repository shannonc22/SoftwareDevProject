/**
name:   Two.java
Description: Exercise for Submission:
Prompt the user to enter two numbers. Using a cascading or nested if/else statement as well as
logical operators AND (&&) and OR (||), determine if:
 both numbers are equal to 2, use logical AND (&&)
 one of the numbers is equal to 2, use logical OR (||)
 If one of the numbers is 2, print out which number entered is equal to 2.
 neither of the numbers is equal to 2


Created By: Shannon Carson
Created On: 18/02/19
*/

import java.util.Scanner;

public class Two{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int x = 0;
		int y = 0;

		System.out.println("Enter Number 1");
		x = input.nextInt();

		System.out.println("Enter Number 2");
		y = input.nextInt();


		if( x == 2 && y == 2){
			System.out.println("Both numbers are equal to 2");
		}
		 else if( x == 2 || y == 2){
			System.out.println("One number is equal to 2");
			if( x == 2){
				System.out.println("Number 1 is equal to 2");
			}
			else if ( y == 2){
				System.out.println("Number 2 is equal to 2");
			}


		}
	      else{
			System.out.println("Neither number is equal to 2");
		}

		Index.main(null);

 }
}




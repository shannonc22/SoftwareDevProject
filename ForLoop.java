/**
name: ForLoop.java
Description: Write a program, ForLoop.java, which uses a counter controlled loop to prompt a user to enter 10
numbers. The program should add up all the values entered by the user which are odd numbers and
print that result to the screen.

Created By: Shannon Carson
Created On: 26/03/19
*/

import java.util.Scanner;

public class ForLoop{
public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int num = 0;



	for(int x = 1; x <= 10; x++){
		System.out.println("Enter number "+x+":");
		num = input.nextInt();

		if(num % 2 != 0){
			sum += num;
		}
	}



	System.out.println("sum of odd numbers is: "+sum);

	Index.main(null);
 }
}

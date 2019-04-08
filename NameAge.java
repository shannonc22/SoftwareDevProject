/**
name: NameAge.java
Description: Write a program which prompts a user to enter their name and age. Implement a while loop to print
out the user’s name for each year of their life.

Created By: Shannon Carson
Created On: 25/02/19
*/

import java.util.Scanner;

public class NameAge{
public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		String name = "";
		int x = 0;

		int counter = 1;

		System.out.println("Enter Name");
		name = input.next();

		System.out.println("Enter age");
		x = input.nextInt();

		while(counter <= x){
					System.out.println(""+name+"");
		counter = counter + 1;
		}

		Index.main(null);

 }
}

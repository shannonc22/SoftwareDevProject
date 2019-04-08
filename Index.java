/**
name: Index.java
Description: Write a program, Index.java, which presents the user with menu options. The options presented in
the menu link to the previous 8 exercises. For example, if the user selects option 1, then the
program from exercise 1 is run. When exercise 1 is completed running, the option menu should be
presented to the user again so they may choose another exercise to run. If the user selects an invlaid
option, write a message to the screen indicating this. A sample program is available on the module
Moodle page which will help you get started with this exercise. Your lecturer will show this to you in
class

Created By: Shannon Carson
Created On: 04/04/19
*/

import java.util.Scanner;

public class Index{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

	int option = 0;

	System.out.println("**** Index ****");
	System.out.println("Exercise 1: Lisa");
	System.out.println("Exercise 2: BigNumber");
	System.out.println("Exercise 3: Number");
	System.out.println("Exercise 4: Two");
	System.out.println("Exercise 5: NameAge");
	System.out.println("Exercise 6: ForLoop");
	System.out.println("Exercise 7: Months");
	System.out.println("Exercise 8: Cards");

	System.out.print("Option <1-8>:");
	option = input.nextInt();

	if(option ==1){
		Lisa.main(null);
	}

	else if (option ==2){
		BigNumber.main(null);
	}
	else if (option ==3){
		Number.main(null);
	}
	else if(option ==4){
		Two.main(null);
	}
    else if (option ==5){
		NameAge.main(null);
	}
	else if (option ==6){
		ForLoop.main(null);
	}
	else if (option ==7){
		months.main(null);
	}
	else if (option ==8){
		cards.main(null);
	}



 }
}
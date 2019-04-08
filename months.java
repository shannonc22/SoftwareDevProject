/**
name: months.java
Description:  Write a program, Months.java, which includes an array which stores the month names – January,
February, March etc.
Using the String method contains, determine which months in the array contain the letter ‘r’ and
print out those months to the screen.

Created By: Shannon Carson
Created On: 01/04/19
*/



public class months{
  public static void main(String[] args){

	String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	String searchStr ="r";
	Boolean found = false;

	for(int i = 0; i < months.length; i++){
	if (months[i].contains(searchStr)){
		System.out.println(months[i]);
	}
}
	Index.main(null);
 }
}


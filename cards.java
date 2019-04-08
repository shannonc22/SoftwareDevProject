/**
name: cards.java
Description:  Create an array that models a deck of cards. For example, “1_of_diamonds” represents the ace of
diamonds, “2_of_diamonds” represents the 2 of diamonds, up to “13_of_diamonds”, which
represents the King of diamonds. The suits clubs, hearts and spades are represented in a similar
manner. All these elements should be in a single array. The array should be populated using a
counter controlled loop. Output the contents of the array to the screen.
Shuffle the deck. The deck can be shuffled using the method below. Note that you can pass your
array as an argument to the method and that your program needs to import the java.util.Random
object.
Once the deck is shuffled, print out the contents of your shuffled deck to the screen. Name your
program Cards.java.

Created By: Shannon Carson
Created On: 02/04/19
*/
import java.util.Random;

public class cards{
  public static void main(String [] args){


	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("--------Cards-------");
	System.out.println("");
	System.out.println("");

	cards m = new cards();

	String[] deck = new String[52];
    int c = -1;
	for(int i = 1; i <= 13; i++){
		deck[++c]=i+"_of_Diamonds";
		deck[++c]=i+"_of_Clubs";
		deck[++c]=i+"_of_Hearts";
		deck[++c]=i+"_of_Spades";
	}

	System.out.println("Not Shuffled");
	System.out.println("");
	for(int n = 1; n < deck.length; n++){
		System.out.println(deck[n]);
	}

	m.shuffle(deck);
	System.out.println("");
	System.out.println("");
	System.out.println("Shuffled");
	System.out.println("");
	for(int s = 1; s < deck.length; s++){

	System.out.println(deck[s]);

	}

}


	public String[] shuffle(String[] deck){
		Random rnd = new Random();
		for (int i = deck.length - 1; i >= 0; i--){
			int index = rnd.nextInt(i + 1);

			String a = deck[index];
			deck[index] = deck[i];
			deck [i] = a;

		}

		return deck;

		Index.main(null);

	}
}
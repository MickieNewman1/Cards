/* *****************************************************************************
 *              
 * Title:            CardsDriver
 * Files:            CardsDriver.java
 * Semester:         Spring 2021
 * 
 * Author:           Mickie Newman mcne8887@colorado.edu
 * 
 * Description:		 it creates a deck using the Deck object and then gives you a hand 
 * 
 * Written:       	 March 7th 2021
 * 
 * Credits:          
 **************************************************************************** */

/**
 * A program to test the Deck and Cards classes. Attempts to deal a hand
 * and print it out.
 * 
 * <p>
 * Bugs: 
 * 
 * @author (Mickie Newman)
 *
 */
public class CardsDriver {

	/**
	 * Main entry point for the program. Attempts to create a deck and deal a hand.
	 * 
	 * @param args No command-line arguments expected.
	 */
	public static void main(String[] args) {
		
		// Create a new deck
		Deck deck = new Deck();
		//System.out.println(deck); // uncomment if you want to print the pre-shuffled deck out
		
		//System.out.println("------------");
		
		// Shuffle the deck 
		deck.shuffle();
		//System.out.println(deck); // uncomment if you want to print out the shuffled deck
		
		// Try to deal a 5 card hand
		Card[] hand = new Card[5];
		for(int i = 0; i < 5; i++) {
			hand[i] = deck.dealCard();
		}
		
		// Print out the hand that was dealt
		System.out.println("Your hand: ");
		for(int i = 0; i < 5; i++) {
			System.out.println(hand[i]);
		}
		
		// Could extend this to play some games, e.g., high/low, war, poker...

	}

}

/* *****************************************************************************
 *              
 * Title:            Card
 * Files:            Card.java
 *
 * 
 * Author:           Mickie Newman mcne8887@colorado.edu
 * 
 * Description:		 this makes a card with a value and suit as an object 
 * 
 * Written:       	 March 7th 2021
 * 
 * Credits:          got help from https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
 **************************************************************************** */

/**
 * A Card represents a playing card with one of four suits (spades, hearts, diamond,
 * or clubs) and a value (Ace, 2-10, Jack, Queen, or King).
 * 
 * <p>
 * Bugs: (a list of bugs and other problems)
 * 
 * @author (Mickie Newman)
 *
 */
import java.util.Random;

public class Card {

	// Codes for the 4 suits
	public static final int SPADES = 0;   
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;

	public static final int ACE = 1;      // Codes for the non-numeric cards.
	public static final int JACK = 11;    //   Cards 2 through 10 have their 
	public static final int QUEEN = 12;   //   numerical values for their codes.
	public static final int KING = 13;

	/**
	 * This card's suit, one of the constants SPADES, HEARTS, DIAMONDS,
	 * or CLUBS.  The suit cannot be changed after the card is
	 * constructed.
	 */
	private final int suit; 
	

	/**
	 * The card's value.  For a normal card, this is one of the values
	 * 1 through 13, with 1 representing ACE. 
	 * The value cannot be changed after the card
	 * is constructed.
	 */
	private final int value;// face of the card 
	

	/**
	 * Creates a card with a specified suit and value.
	 * 
	 * @param theValue the value of the new card, which must be in 
	 * 				   the range 1 through 13, with 1 representing an Ace.
	 * 				   You can use the constants Card.ACE, Card.JACK, 
	 * 				   Card.QUEEN, and Card.KING.  
	 * 
	 * @param theSuit the suit of the new card. This must be one of the 
	 * 				  values Card.SPADES, Card.HEARTS, Card.DIAMONDS, 
	 * 				  or Card.CLUBS.
	 * 
	 * @throws IllegalArgumentException if the parameter values are not 
	 * 								    in the permissible ranges
	 */
	public Card(int value, int suit) {
		
		
		Random rand = new Random();
		int n = rand.nextInt(4);
		int m = rand.nextInt(13) + 1;
		this.suit = n;
		this.value = m;
		//TODO: Your code here
		
	}

	/**
	 * Returns the suit of this card.
	 * 
	 * @returns the suit, which is one of the constants Card.SPADES, 
	 * Card.HEARTS, Card.DIAMONDS, or Card.CLUBS
	 */
	public int getSuit() {
		
		//TODO: Your code here
		return suit;
	}

	/**
	 * Returns the value of this card.
	 * 
	 * @return the value, which is one of the numbers 1 through 13
	 */
	public int getValue() {
		
		//TODO: Your code here
		return value;
	}

	/**
	 * Returns a String representation of the card's suit.
	 * @return One of the strings "Spades", "Hearts", "Diamonds", or "Clubs"
	 */
	public String getSuitAsString() {
		switch(suit) {
		case 0 : return "SPADES";
		case 1 : return "HEARTS";
		case 2 : return "DIAMONDS";
		case 3 : return "CLUBS";
		default : return "";
		}
		//TODO: Your code here
	}

	/**
	 * Returns a String representation of the card's value.
	 * 
	 * @return  One of the Strings "Ace", "2",
	 *         "3", ..., "10", "Jack", "Queen", or "King". 
	 */
	public String getValueAsString() {
		switch(value) {
		case 1 : return "Ace";
		case 2 : return "2";
		case 3 : return "3";
		case 4 : return "4";
		case 5 : return "5";
		case 6 : return "6";
		case 7 : return "7";
		case 8 : return "8";
		case 9 : return "9";
		case 10 : return "10";
		case 11 : return "Jack";
		case 12 : return "Queen";
		case 13 : return "King";
		default : return "";
		}
		//TODO: Your code here
	}

	/**
	 * Returns a String representation of this card, including both
	 * its suit and its value. Sample return values
	 * are: "Queen of Hearts", "10 of Diamonds", "Ace of Spades"
	 * 
	 * @return A String representation of the card with its suit and value
	 */
	public String toString() {
		//TODO: Your code here
		String s = getValueAsString()+ " of " + getSuitAsString();
		return s;
	}
}

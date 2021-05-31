package com.chaptersSeven;

import java.security.SecureRandom;

public class DeckOfCard {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 53;
	private static final SecureRandom rand = new SecureRandom();
	
	public DeckOfCard() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"	
		};
		String[] suits = {"Heart","Diamonds","Clubs","Spades"};
		deck = new Card[NUMBER_OF_CARDS];
		currentCard =0;
		
		for(int count = 0; count <deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count/13]);
		}
	}
	public void shuffle() {
		currentCard = 0;
		
		for (int first =0; first < deck.length; first++) {
			int second = rand.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	public Card dealCard() {
		if(currentCard < deck.length)
			return deck[currentCard];
		else
			return null;
	}
}

/**
 * Program for Deck Of Card using oops concept
 */
package com.bridgelabz.workshop;

public class DeckOfCard {

    public static void main(String[] args) {
        System.out.println("Welcome into the Decks of Cards!!! Thank you");
        CardPlay cardsPlay = new CardPlay();
        cardsPlay.generateUniqueCards();
        cardsPlay.addPlayer();
    }
}
/**
 * Program for Deck Of Card using oops concept
 */
package com.bridgelabz.workshop;

import java.util.Scanner;

public class DeckOfCard {

    public static void main(String[] args) {
        System.out.println("Welcome into the Decks of Cards!!! Thank you");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of players :");
        int playerCount = sc.nextInt();

        CardPlay play = new CardPlay(playerCount);
        play.generateCards();
        play.printCards();
        play.addPlayer();
        play.distributeCards();
        play.printCardList();

    }
}
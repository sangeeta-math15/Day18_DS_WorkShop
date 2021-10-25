/**
 * Program for Deck Of Card using oops concept
 */
package com.bridgelabz.workshop;

import java.util.Scanner;

public class DeckOfCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of players :");
        int playerCount = sc.nextInt();
        CardPlay play = new CardPlay(playerCount);
        play.generateCards();
        play.addPlayer();
        play.setPlayerSequence();
        play.distributeCards();
        play.printCardList();
    }
}
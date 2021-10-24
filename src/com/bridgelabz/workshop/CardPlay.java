package com.bridgelabz.workshop;

public class CardPlay {
    String[] card = new String[52];

    public void uniqueCards() {
        String[] suit = {"clubs", "Diamonds", "Heart", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queue", "King", "Ace"};
        int position = 0;
        //get combination
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                card[position] = suit[i] + rank[j];
                position++;
                System.out.println(card[position] = suit[i] + rank[j]);
            }
        }
    }
}

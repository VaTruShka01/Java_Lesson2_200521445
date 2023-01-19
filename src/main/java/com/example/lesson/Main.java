package com.example.lesson;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card ("10","clubs");
        System.out.println(card1.whatCard());

        System.out.println(card1 + " colour: " + card1.getColour());
        System.out.println(card1 + " value: " + card1.getCardValue());

        DeckOfCards deck = new DeckOfCards();

    }
}

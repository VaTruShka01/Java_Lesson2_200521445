package com.example.lesson;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {

    private ArrayList<Card> deck;

    public DeckOfCards(){
        deck = new ArrayList<>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();


        for (int i = 0; i < suits.size(); i++){

            for (String faceName: faceNames) {
                System.out.println(faceName + " of " + suits.get(i));
            }
        }


    }

}

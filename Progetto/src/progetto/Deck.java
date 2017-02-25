/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto;

import Cards.Card;
import java.util.*;

/**
 *
 * @author Riccardo
 */
public class Deck {
    int numberOfCards;
    Stack<Card> cards;

    public Deck() {
        cards = new Stack<Card>();
        numberOfCards =0;
    }
    

    /*metodo da usare nella fase iniziale: aggiungere le carte al deck*/
    public void addCard(Card card){
        cards.push(card);
        numberOfCards++;
    }
    
    /*pesca (restituisce) una carta, se non ci sono carte restituisce NULL*/
    public Card draw(){
        if (numberOfCards>0){
            Card card = cards.pop();
            numberOfCards--;
            return card;
        }else{
            return null;
        }
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    
    
    
}

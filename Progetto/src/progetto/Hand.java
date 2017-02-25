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
public class Hand {
    int numberOfCards;
    ArrayList<Card> cards;
    
    public int getNumberOfCards(){
        return numberOfCards;
    }
    /*aggiunge una carta alla mano*/
    public void addCard(Card card){
        if (numberOfCards <= 7){
            cards.add(card);
        }else{
            removeACard();
        }
    }
    
    private void removeCardAtIndex(int index){
        cards.remove(index);
    }
    
    void removeACard(){
        /*chiede al giocatore di scegliere quale carta rimuovere*/
        /*chiamerà il metodo removeCardAtIndex();*/
    }
    
    
}

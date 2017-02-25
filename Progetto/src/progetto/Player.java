/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto;

import Cards.*;

/**
 *
 * @author Riccardo
 */
public class Player {
    Deck deck;
    Hand hand;
    
    public Player(){
        deck = new Deck();
        hand = new Hand();
    }
    
    public void setDeck(Deck deck){
        this.deck = deck;
    }
    
    public void play(Card card){
        
    }
    
    public void draw(){
        hand.addCard(deck.draw());
    }
    
    
    
    
}

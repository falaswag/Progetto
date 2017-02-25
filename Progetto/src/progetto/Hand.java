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
            removeACard(card);
            
        }
    }
    
    private void removeCardAtIndex(int index){
        cards.remove(index);
    }
    /*compare la mano nella console nel formato
    0:carta, 1:carta, ..., 6:carta 
    il giocatore dovrà scegliere che carta rimuovere per poter inserire
    la nuova carta per poi inserire la carta in questione (o no)*/
    void removeACard(Card card){
        
        int selezione = 0;
        /*chiede al iocatore di scegliere quale carta rimuovere*/
        /*DA IMPLEMENTARE: il risultato andrà messo in selezione*/
        
        /*nel caso in cui venga selezionata una carta questa viene rimossa e viene aggiunta
        la carta appena pescata*/
        if (selezione>0 && selezione<7){
            removeCardAtIndex(selezione);
            cards.add(card);
        }
        
        /*nel caso in cui il giocatore non voglia eliminare alcuna carta dalla mano ma scartare
        quella appena pescata non succede niente (dovrà selezionare un numero >6)*/
        
    }
    
    
}

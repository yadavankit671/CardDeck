// imports 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deck;
    public Deck(){
        deck = new ArrayList<>();
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                deck.add(new Card(suit,rank));
            }
        }
        FisherYatesShuffling(deck);
    }
    
    void FisherYatesShuffling(List<Card> deck){
        Random rand= new Random();
        for(int i=deck.size()-1;i>=0;i--){
            int j=rand.nextInt(i+1);
            Card temp=deck.get(i);
            deck.set(i,deck.get(j));
            deck.set(j,temp);
        }
    }
    @Deprecated
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public Card draw(){
        return deck.removeLast();
    }
    public void print(){
        for(Card card : deck){
            System.out.println(card.toString());
        }
    }
    public int size(){
        return deck.size();
    }
}

// imports needed
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class App {

    // Constants : 
    private static final int no_of_cards_to_draw = 20;
    private static final int standard_deck_size = 52;
    //Sorting Function using custom comparator 
    private static void getItSorted(List<Card> myCards) throws Exception{
        if(myCards.isEmpty()){ // if no cards were drawn
            throw new Exception("!! No Cards Drawn !!");
        }
        //Custom comparator
        Comparator<Card> custom_comparator = (CardA, CardB) -> {
            int dif= CardA.getSuit().getValue()-CardB.getSuit().getValue();
            if(dif==0) return CardA.getRank().getValue()-CardB.getRank().getValue();
            return dif;
        };

        Collections.sort(myCards,custom_comparator);
    }

    // Main funciton //
    public static void main(String[] args) throws Exception {
        Deck myDeck = new Deck();
        
        if(myDeck.size()!=standard_deck_size) {
            throw new Exception("!! Not a Full Deck !!");
        }
        //myDeck.shuffle();  // pre-shuffled

        List<Card> drawnCards=new ArrayList<>();
        
        for(int i=0;i<no_of_cards_to_draw;i++){
            drawnCards.add(myDeck.draw());
        }

        getItSorted(drawnCards);

        // Output After Sorting : 
        for(Card card : drawnCards){
            System.out.println(card.toString());
        }
        
        //Hold the exit
        System.out.print("Press Enter to Exit....");
        System.in.read();
    }
}

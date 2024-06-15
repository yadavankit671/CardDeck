enum Suit{
    Hearts(1),Diamonds(2),Spades(3),Clubs(4);
    private int value;
    private Suit (int value){
        this.value = value;
    }
    public  int getValue(){
        return value;
    }
}
enum Rank{
    Ace(1),Two(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eight(8),Nine(9),Ten(10),Jack(11),Queen(12),King(13);
    private int value;
    private Rank(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
public class Card {
    private Suit suit;
    private Rank rank;
    Card(Suit suit,Rank rank){
        this.rank=rank;
        this.suit=suit;
    }
    public Suit getSuit(){
        return this.suit;
    }
    public Rank getRank(){
        return this.rank;
    }
    public String toString(){
        return this.rank+" of "+this.suit;
    }
}

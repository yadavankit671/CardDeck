# Card-Deck Project

This Java project simulates a standard 52-card deck with functionalities such as shuffling, drawing, and displaying cards. It's designed to mimic the operations of a physical card deck.

## Key Features

- **Standard 52-Card Deck**: Generates a complete deck with all the traditional playing cards.
- **Fisher-Yates Shuffling**: Utilizes the Fisher-Yates algorithm for an unbiased and thorough shuffle.
- **Card Drawing**: Facilitates the drawing of cards from the deck, simulating a real-life card game.
- **Customizable Sorting**: Offers sorting of cards by suit (Red : Heart, Diamond ; Black : Spade, Clubs) and rank in ascending order (Ace to King).
- **User-Friendly Display**: Cards are displayed in an easy-to-read format, such as "Ace of Spades".

## Project Components

- `App.java`: The driver class that orchestrates deck operations and user interactions.
- `Deck.java`: Defines the deck structure and includes methods for shuffling and drawing cards.
- `Card.java`: Describes individual cards with suit and rank attributes and a method for formatted display.

## How to Run

### Compilation

To compile the source files, use the following command:

```bash
javac App.java Deck.java Card.java
```
**Execution**<br>
Run the compiled App class to start the program:

>CardDeck.jar

The application will present a sorted list of cards drawn from the deck.

### Customization Options
- Draw Count: Alter the no_of_cards_to_draw variable in `App.java` to change the number of cards drawn.
- Sorting Criteria: Modify the getItSorted method in `App.java` for different sorting logic, or adjust the suit and rank values in `Card.java`.
- The deck is automatically shuffled using the Fisher-Yates method upon initialization of the deck. Although you can opt to shuffle it later using shuffle method.
- Comprehensive error handling ensures the integrity of deck operations and card availability.

### Sample Output
```
Ace of Hearts
Two of Hearts
Five of Diamonds
Seven of Diamonds
Jack of Diamonds
Ace of Spades
Four of Spades
Six of Spades
Queen of Spades
King of Spades
Two of Clubs
Three of Clubs
Five of Clubs
Seven of Clubs
Eight of Clubs
Nine of Clubs
Ten of Clubs
Jack of Clubs
Queen of Clubs
King of Clubs


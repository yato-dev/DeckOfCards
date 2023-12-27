import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

     
        Collections.shuffle(deck, new Random());

        String[][] playersCards = new String[4][9];
        int cardIndex = 0;

        for (int player = 0; player < 4; player++) {
            for (int card = 0; card < 9; card++) {
                playersCards[player][card] = deck.get(cardIndex);
                cardIndex++;
            }
        }

 
        for (int player = 0; player < 4; player++) {
            System.out.println("Player " + (player + 1) + " cards:");
            for (int card = 0; card < 9; card++) {
                System.out.println(playersCards[player][card]);
            }
            System.out.println();
        }
    }
}

package Chapter7;
import java.util.Scanner;


public class Case_2DeckofCards {
    public static void main(String[] args){
        int[] deck = new int[52];

        // initiate the deck
        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        // reshuffle the deck
        for(int i = 0; i < deck.length; i++){
            int temp = deck[i];
            int j = (int)(Math.random() * deck.length);
            deck[i] = deck[j];
            deck[j] = temp;    
        }

        // pick a card
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a card (1 to yes, 0 to stop): ");
        int pick = sc.nextInt();
        int randPick = 0;

        // generate a random number as an index
        if(pick == 1){
            randPick = (int)(Math.random() * deck.length);
        } else {
            System.out.println("The game stops.");
            System.exit(1);
        }

        // retrive the number by the index
        int n = deck[randPick];

        // construct the array representing the suit and rank
        String[] cardSuit = {"Spade", "Heart", "Diamond", "Club"};
        String[] cardRank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        System.out.println("Display the first 4 cards of the shuffled deck:");
        for(int i = 0; i < 4; i++){
            int t = deck[i];
            System.out.printf("card %d: %s of %s.\n", t+1, cardRank[t%13], cardSuit[t/13]);
        }

        System.out.printf("The card you pick is %s of %s.\n", cardRank[n%13], cardSuit[n/13]);


        sc.close();
    }
}

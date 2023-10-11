package Chapter7;
import java.util.Scanner;


public class Case_2DeckofCards {
    public static void main(String[] args){
        int[] deck = new int[52];

        // initiate the deck
        for(int i = 0; i < deck.length; i++){
            deck[i] = i+1;
        }

        // reshuffle the deck
        for(int i = 0; i < deck.length - 1; i++){
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

        if(pick == 1){
            randPick = (int)(Math.random() * deck.length);
        } else {
            System.out.println("The game stops.");
            System.exit(1);
        }

        int n = deck[randPick-1];

        String[] cardSuit = {"Spade", "Heart", "Diamond", "Club"};
        String[] rankSuit = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int suit = Math.ceilDiv(n, 13);
        int rank = 0;
        if (n % 13 == 0){
            rank = 13;
        } else{
            rank = n%13;
        }


        System.out.printf("The card you pick is %s of %s.\n", rankSuit[rank-1], cardSuit[suit-1]);

        sc.close();
    }
}

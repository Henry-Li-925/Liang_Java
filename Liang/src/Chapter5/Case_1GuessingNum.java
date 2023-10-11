package Chapter5;
import java.util.Scanner;

public class Case_1GuessingNum {
    public static void main(String[] args){
        int num = (int)(Math.random()*101);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess number between 0 and 100: ");
        int guess = sc.nextInt();

        while(guess != num){
            if (guess < num){
                System.out.println("Your guess is lower than the number, please try again");
            }
            if (guess > num){
                System.out.println("Your guess is higher than the number, please try again");
            }
        System.out.print("Enter your guess number between 0 and 100: ");
        guess = sc.nextInt();
        }

        System.out.println("Your guess is spot on! Congratulation!");

        sc.close();
    }
}

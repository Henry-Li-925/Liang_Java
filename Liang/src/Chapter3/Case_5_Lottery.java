package Chapter3;
import java.util.Scanner;

public class Case_5_Lottery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess two-digit number: ");

        int guess = sc.nextInt();
        int num = (int)(Math.random() * 100), first_digit = num%10, second_digit = num/10;
        int guessFirst_digit = guess % 10, guessSecond_digit = guess/10;
        int prize=0; 

        if (guess == num){
            prize = 10000;
        } else if ((guessFirst_digit == second_digit) && (guessSecond_digit == first_digit)){
            prize = 3000;
        } else if ((guessFirst_digit == first_digit || guessFirst_digit == second_digit) || (guessSecond_digit == first_digit || guessSecond_digit == second_digit)){
            prize = 1000;
        } else {}

        System.out.println("The random number is "+ num);
        System.out.println("Your prize is "+ prize);

        sc.close();
    }
}

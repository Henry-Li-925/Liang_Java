package Chapter4;
import java.util.Scanner;

public class Case_3LotteryUsingString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess number in two digits: ");
        String guess = sc.nextLine();
        char guess_1 = guess.charAt(0);
        char guess_2 = guess.charAt(1);

        // Check the validity of the input
        if ((guess.length() <= 2 && Character.isDigit(guess_1) && Character.isDigit(guess_2)) == false){
            System.out.println("Your input is invalid");
            System.exit(1);
        }
        


        String num = (int)(Math.random() * 100) + "";
        char num_1 = num.charAt(0);
        char num_2 = num.charAt(1);

        System.out.println("The random num is " + num);

        if (guess.compareToIgnoreCase(num) == 0){
            System.out.println("Your prize is $10000");
        } else if (guess_1 == num_2 && guess_2 == num_1){
            System.out.println("Your prize is $3000");
        } else if ((guess_1 == num_1 || guess_1 == num_2)){
            System.out.println("Your prize is $1000");
        } else if ((guess_2 == num_1 || guess_2 == num_2)){
            System.out.println("Your prize is $1000");
        } else{
            System.out.println("Unfortunately, you do not have a prize");
        }

        sc.close();
    }
}

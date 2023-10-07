package Chapter3;
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        int num1, num2, sub;
        num1 = (int)(Math.random() * 10);
        num2 = (int)(Math.random() * 10);

        System.out.println("number1 is "+num1);
        System.out.println("number2 is "+num2);

        if (num1 < num2){
            sub = num2 - num1;
        }
        else{
            sub = num1 - num2;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("What is number1 - number2? ");

        int answer = sc.nextInt();

        boolean result = answer == sub;

        System.out.println("number1 " + num1 + " - number2 " + num2 + " equals " + answer + " is "+ result);

        sc.close();
    }
}

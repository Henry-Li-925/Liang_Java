package Chapter2;
import java.util.*;

public class Case_2_CountingMonetaryUnits {
    public static void main(String[] args){
        System.out.print("Enter the amount: ");
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        int cent = (int)(amount * 100);

        int dollar = cent / 100;
        int remainCent = cent % 100;

        int quarter = remainCent / 25;
        remainCent = remainCent % 25;

        int dime = remainCent / 10;
        remainCent = remainCent % 10;

        int nickle = remainCent / 5;
        remainCent = remainCent % 5;

        System.out.println("The amount is " + dollar + " dollars "
        + quarter + " quarters " + dime + " dimes " + nickle 
        + " nickles " + remainCent + " pennies ");

        sc.close();
    }
    

}

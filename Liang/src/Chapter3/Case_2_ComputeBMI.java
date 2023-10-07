package Chapter3;
import java.util.Scanner;

public class Case_2_ComputeBMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");

        double weight = sc.nextDouble();

        System.out.print("Enter your height in inches: ");

        double height = sc.nextDouble();

        final double POUND_TO_KILOS = 0.45359237, INCH_TO_METERS = 0.0254;

        double bmi = (weight * POUND_TO_KILOS) / Math.pow(height * INCH_TO_METERS, 2);

        String result;
        if (bmi>=30.0){
            result = "Obese";
        } else if (bmi>=25.0){
            result = "Overweight";
        } else if (bmi>=18.5){
            result = "Normal";
        } else {
            result = "Underweight";
        }

        System.out.println("Your BMI "+ bmi +" shows that you're " + result);

        sc.close();
    }
}

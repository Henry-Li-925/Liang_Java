package Chapter3;
import java.util.Scanner;

public class Case_3_ComputeTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marrital status: ");
        System.out.println("0 = Single Filers");
        System.out.println("1 = Married Filing Jointly or Qualified Widow(er)");
        System.out.println("2 = Married Filing Separately");
        System.out.println("3 = Head of Household");

        int marritalStatus = sc.nextInt();

        System.out.println("Enter your yearly income: ");

        double income = sc.nextDouble();
        double taxes=0, taxible=0, taxRate=0, deductibles=0;

        switch (marritalStatus){
            case 0: if (income >= 372951){
                deductibles = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33;
                taxRate = 0.35;
                taxible = income - 372950;
            } else if (income >= 171551){
                deductibles = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28;
                taxRate = 0.33;
                taxible = income - 171550;
            } else if (income >= 82251){
                deductibles = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25;
                taxRate = 0.28;
                taxible = income - 82250;
            } else if (income >= 33951){
                deductibles = 8350*0.1+(33950-8350)*0.15;
                taxRate = 0.25;
                taxible = income - 33950;
            } else if (income >= 8351){
                deductibles = 8350*0.1;
                taxRate = 0.15;
                taxible = income - 8350;
            } else {
                deductibles = 0;
                taxRate = 0.1;
                taxible = income;
            }
            break;
            
            case 1: if (income >= 372951){
                deductibles = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33;
                taxRate = 0.35;
                taxible = income - 372950;                
            } else if (income >= 208851){
                deductibles = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28;
                taxRate = 0.33;
                taxible = income - 208850;
            } else if (income >= 137051){
                deductibles = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25;
                taxRate = 0.28;
                taxible = income - 137050;
            } else if (income >= 67901){
                deductibles = 16700*0.1+(67900-16700)*0.15;
                taxRate = 0.25;
                taxible = income - 67900;
            } else if (income >= 16701){
                deductibles = 16700*0.1;
                taxRate = 0.15;
                taxible = income - 16700;
            } else {
                deductibles = 0;
                taxRate = 0.1;
                taxible = income;
            }
            break;

            case 2: if (income >= 186476){
                deductibles = 8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(186475-104425)*0.33;
                taxRate = 0.35;
                taxible = income - 186475;                
            } else if (income >= 104426){
                deductibles = 8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28;
                taxRate = 0.33;
                taxible = income - 104425;  
            } else if (income >= 68526){
                deductibles = 8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25;
                taxRate = 0.28;
                taxible = income - 68525;  
            } else if (income >= 33951){
                deductibles = 8350*0.1+(33950-8350)*0.15;
                taxRate = 0.25;
                taxible = income - 33950; 
            } else if (income >= 8351){
                deductibles = 8350*0.1;
                taxRate = 0.15;
                taxible = income - 8350;
            } else {
                deductibles = 0;
                taxRate = 0.1;
                taxible = income;
            }
            break;

            case 3: if (income >= 372951){
                deductibles = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-190200)*0.33;
                taxRate = 0.35;
                taxible = income - 372950;                
            } else if (income >= 190201){
                deductibles = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28;
                taxRate = 0.33;
                taxible = income - 190200;
            } else if (income >= 117451){
                deductibles = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25;
                taxRate = 0.28;
                taxible = income - 117450;
            } else if (income >= 45501){
                deductibles = 11950*0.1+(45500-11950)*0.15;
                taxRate = 0.25;
                taxible = income - 45500;
            } else if (income >= 11951){
                deductibles = 11950*0.1;
                taxRate = 0.15;
                taxible = income - 11950;
            } else {
                deductibles = 0;
                taxRate = 0.1;
                taxible = income;
            }
            break;

            default: System.out.println("Error: Invalid Status.");
            System.exit(1);
        }

        taxes = (int)((taxible*taxRate+deductibles)*100) / 100.0;
        System.out.println("There are " + taxes + " yearly personal income taxes collectible.");

        sc.close();
    }
}

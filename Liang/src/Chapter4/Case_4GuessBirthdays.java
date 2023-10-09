package Chapter4;
import java.util.Scanner;


public class Case_4GuessBirthdays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Whether the day of your birthday is in Set1 (0 = No, 1 = Yes): ");
        int Set1 = Integer.parseInt(sc.nextLine());
        System.out.print("Whether the day of your birthday is in Set2 (0 = No, 1 = Yes): ");
        int Set2 = Integer.parseInt(sc.nextLine());
        System.out.print("Whether the day of your birthday is in Set3 (0 = No, 1 = Yes): ");
        int Set3 = Integer.parseInt(sc.nextLine());
        System.out.print("Whether the day of your birthday is in Set4 (0 = No, 1 = Yes): ");
        int Set4 = Integer.parseInt(sc.nextLine());
        System.out.print("Whether the day of your birthday is in Set5 (0 = No, 1 = Yes): ");
        int Set5 = Integer.parseInt(sc.nextLine());

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        if(Set1 == 1){
            num1 = 1;
        }
        if(Set2 == 1){
            num2 = 2;
        }
        if(Set3 == 1){
            num3 = 4;
        }
        if(Set4 == 1){
            num4 = 8;
        }
        if(Set5 == 1){
            num5 = 16;
        }

        int day = num1 + num2 + num3 + num4 + num5;

        System.out.println("The day of your birthday is "+ day);

        sc.close();
    }
}

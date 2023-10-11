package Chapter5;
import java.util.Scanner;

public class Case_2GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter one number: ");
        int n2 = sc.nextInt();
        
        int limit;
        if(n1 <= n2){
            limit = n1;
        } else {
            limit = n2;
        }

        int greatestCommonDivisor=1;
        for(int i = 1; i <= limit; i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                greatestCommonDivisor = i;
            }
        }

        System.out.printf("The greatest common divisor for %-1d and %-1d is %-1d"
        , n1, n2, greatestCommonDivisor);

        sc.close();
    }
}

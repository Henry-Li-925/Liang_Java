package Chapter7;
import java.util.Scanner;


public class Case_1AnalyzingNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number you wish: ");
        int length = sc.nextInt();

        int[] arr = new int[length];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * arr.length);
            sum += arr[i];
        }

        avg = sum / arr.length;

        System.out.println("The average of the list of number is "+avg);

        int j=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg){
                System.out.printf("The %d number of item %d is greater than the average\n", i, arr[i]);
                j++;
            }
        }

        System.out.printf("There are %d number of items greater than the average", j);
        
        sc.close();
    }
}

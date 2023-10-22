package Chapter8;
import java.util.Scanner;

public class Case_5GuessBirthday {
    public static void main(String[] args){
        int[][][] birthday = {
            {{1,3,5,7},{9,11,13,15},{17,19,21,23},{25,27,29,31}},
            {{2,3,6,7},{10,11,14,15},{18,19,22,23},{26,27,30,31}},
            {{4,5,6,7},{12,13,14,15},{20,21,22,23},{28,29,30,31}},
            {{8,9,10,11},{12,13,14,15},{24,25,26,27},{28,29,30,31}},
            {{16,17,18,19},{20,21,22,23},{24,25,26,27},{28,29,30,31}}
        };

        Scanner sc = new Scanner(System.in);
        int[] guess = new int[5];
        int result = 0;

        for(int i = 0; i < birthday.length; i++){
            System.out.printf("Set[%d]\n", i+1);
            for(int j = 0; j < birthday[i].length; j++){
                for(int k = 0; k < birthday[i][j].length; k++){
                    System.out.printf("%d\t", birthday[i][j][k]);
                }
                System.out.printf("\n");
            }
        }

        for(int i = 0; i < birthday.length; i ++){
            System.out.printf("\nDoes the set No.%d contain the date of your birthday?(YES:1, NO:0): ", i+1);
            guess[i] = sc.nextInt();
            if(guess[i] < 0 || guess[i] > 1){
                System.out.println("Please answer in 1 or 0.");
                System.exit(1);
            } else if(guess[i] == 1){
                result += birthday[i][0][0];
            }
        }

        System.out.printf("The date of your birthday is %d", result);
        
    }
}

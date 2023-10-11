package Chapter5;

public class Case_3PredictingFutureTuition {
    public static void main(String[] args){
        double initial = 10000;
        int year = 0;
        while(initial < 20000){
            initial = initial * 1.07;
            year++;
        }

        System.out.printf("It takes %-2d years for the tuition to double", year);
    }
}
package Chapter7;

public class VarArgsDemo {
    public static void main(String[] args){ 
        printMax(34,3,3,2,56.5); //variable-length argument
        printMax(new double[]{1,2,3}); //variable-length array
    }

    public static void printMax(double... numbers){ // only one argument specified can be of variable-length, and any regular argument should precede it
        if (numbers.length == 0){ // variable-length argument is treated as an array
            System.out.println("No argument passed");
            return;
        } 
        
        double result = numbers[0];

        for(int i = 0; i < numbers.length; i ++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("The max value is " + result);
    }
}

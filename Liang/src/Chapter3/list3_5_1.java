package Chapter3;

public class list3_5_1{
    public static void main(String[] args){
        int x,y;

        x = 2;
        y = 3;

        if(x>2){
            if(y>2){
                int z = x + y;
                System.out.println("z is " + z);
            }
        }
        else{
            System.out.println("x is "+ x);
        }
    }
}
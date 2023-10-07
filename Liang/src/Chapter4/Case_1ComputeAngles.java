package Chapter4;
import java.util.Scanner;

public class Case_1ComputeAngles {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the coordinates of A, B, C");
        System.out.print("X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Y1: ");
        double y1 = sc.nextDouble();
        System.out.print("X2: ");
        double x2 = sc.nextDouble();
        System.out.print("Y2: ");
        double y2 = sc.nextDouble();
        System.out.print("X3: ");
        double x3 = sc.nextDouble();
        System.out.print("Y3: ");
        double y3 = sc.nextDouble();

        double a = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
        double b = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
        double c = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        double A = Math.toDegrees(Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((Math.pow(c, 2) - Math.pow(b, 2) - Math.pow(a, 2)) / (-2 * a * b)));

        System.out.println("A is " + Math.round(A*100)/100.0);
        System.out.println("B is " + Math.round(B*100)/100.0);
        System.out.println("C is " + Math.round(C*100)/100.0);
        
        sc.close();
    }
}

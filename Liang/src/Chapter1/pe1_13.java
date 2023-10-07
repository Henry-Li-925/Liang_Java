package Chapter1;

public class pe1_13 {
    public static void main(String[] args){
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / denominator(a,b,c,d);
        double y = (a * f - e * c) / denominator(a, b, c, d);

        System.out.println("The x is "+ x);
        System.out.println("The y is "+ y);
        
        
    }

    public static double denominator(double a, double b, double c, double d){
        return (a * d - b * c);
    }
}

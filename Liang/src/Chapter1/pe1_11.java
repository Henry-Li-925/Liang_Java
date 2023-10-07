package Chapter1;

public class pe1_11 {
    public static void main(String[] args){
        double pop = 312032486;
        double second = 365 * 24 * 60 * 60;
        double birthPerSec = 1/7;
        double deathPerSec = 1/13;
        double immiPerSec = 1/45;
        System.out.println("The population for first year: " + ((pop 
        + (birthPerSec - deathPerSec + immiPerSec) * second) * 1));
        System.out.println("The population for second year: " + ((pop 
        + (birthPerSec - deathPerSec + immiPerSec) * second) * 2));
        System.out.println("The population for third year: " + ((pop 
        + (birthPerSec - deathPerSec + immiPerSec) * second) * 3));
        System.out.println("The population for fourth year: " + ((pop 
        + (birthPerSec - deathPerSec + immiPerSec) * second) * 4));
        System.out.println("The population for fifth year: " + ((pop 
        + (birthPerSec - deathPerSec + immiPerSec) * second) * 5));
        
    }
}

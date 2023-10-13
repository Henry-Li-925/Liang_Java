package Chapter7;

public class Case_3CountingLetterOccurance {
    public static void main(String[] args){

        // generate a 100 random lowercase letter array
        char[] charArr = new char[100];
        for(int i = 0; i < charArr.length; i++){
            charArr[i] = RandomLowerCaseChar(); // use RandomLowerCaseChar method to generate random lowercase letter
        }

        // count the occrance of each letter using countOccurance method
        int sum = 0;
        char[] lowerCaseChar = new char[26];
        for(int i = 0; i < lowerCaseChar.length; i++){
            lowerCaseChar[i] = (char)('a' + i);
            System.out.printf("The occrance of letter %c is %d.\n", lowerCaseChar[i], countOccurance(charArr, lowerCaseChar[i]));
            sum += countOccurance(charArr, lowerCaseChar[i]);
        }

        System.out.printf("The sum is %d", sum);
    }

    public static char RandomLowerCaseChar(){
        char n;
        //single characters are computable, and by adding the difference between 'a' and a lowercase letter to 'a' we can get that letter.
        // remember to plus 1 when use Math.random() to generate a random number between 1 and the leftmost range inclusively
        n = (char)('a' + Math.random() * ('z' - 'a' + 1)); 
        return n;
    }

    public static int countOccurance(char[] charArr, char char1) {
        int result = 0;
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == char1){
                result ++;
            }
        }
        return result;
    }
}

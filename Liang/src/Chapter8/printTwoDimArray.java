package Chapter8;

public class printTwoDimArray {
    public static void IntPrint(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ "\t");
            }
        }
    }
    
    public static void DoublePrint(double[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ "\t");
            }
        }
    }

    public static void StringPrint(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ "\t");
            }
        }
    }

    public static void CharPrint(char[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ "\t");
            }
        }
    }

    public static void BoolPrint(Boolean[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ "\t");
            }
        }
    }
}
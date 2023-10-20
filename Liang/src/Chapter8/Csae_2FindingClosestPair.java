package Chapter8;

public class Csae_2FindingClosestPair {
    public static void main(String[] args){
        double[][] dotsets = new double[][]{
            {-1,3},
            {-1,-1},
            {1,1},
            {2,0.5},
            {2,-1},
            {3,3},
            {4,2},
            {4,-0.5}
        };

        double[] distanceArr = new double[8];
        double[] closestPair = new double[2];
        int closestPairIndex=0;

        // nested for loop
        // the outer for loop iterates the process with each dot
        for(int i = 0; i < dotsets.length; i++){
            double[] dot = dotsets[i];
            // the inner loop iterates the distance method with the second dot given the first one
            for(int j = 0; j < distanceArr.length; j++){
            distanceArr[j] = distance(dot, dotsets[j]);
            }
            // for each first dot, find its closest pair and print the result
            closestPairIndex = findMin(distanceArr);
            closestPair = dotsets[closestPairIndex];
            System.out.printf("The closest pair to the dot (%.2f, %.2f) is (%.2f, %.2f), and the distance between them is %.2f.\n", 
            dot[0], dot[1], closestPair[0], closestPair[1], distanceArr[closestPairIndex]);
        }        
    }

    // input two dots, and return the distance between in double.
    public static double distance(double[] dot1, double[] dot2){
        double result;
        double x1 = dot1[0], y1 = dot1[1];
        double x2 = dot2[0], y2 = dot2[1];

        result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        return result;
    }

    // given a double array, find the index of the minimum positive number.
    public static int findMin(double[] arr){
        int result = 0;
        double min;
        // initialize `min` as the second element of the array as long as the first one is zero. 
        if(arr[0] == 0){
            min = arr[1];} else{
                min = arr[0];
            }
        
        // return the index of the minimum positive number.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){continue;}
            else{
                if(arr[i] < min){
                    min = arr[i];
                    result = i;
                }
            }
        }
        return result;
    }
}

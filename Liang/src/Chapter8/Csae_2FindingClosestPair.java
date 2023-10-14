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

        for(int i = 0; i < dotsets.length; i++){
            double[] dot = dotsets[i];
            distanceArr = getDistanceArr(dot, dotsets);
            for(int j = 0; j < distanceArr.length; j++){
                if(distanceArr[j] == 0){continue;}
                else{
                    closestPairIndex = findMin(distanceArr); 
                    closestPair = dotsets[closestPairIndex];
                }
            }
            
            System.out.printf("The closest pair for dot (%.2f, %.2f) is (%.2f, %.2f)\n", dotsets[i][0], dotsets[i][1], closestPair[0], closestPair[1]);
        }
    }


    public static double distance(double[] dot1, double[] dot2){
        double result;
        double x1 = dot1[0], y1 = dot2[1];
        double x2 = dot2[0], y2 = dot2[1];

        result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        return result;
    }

    public static double[] getDistanceArr(double[] arr, double[][] mat){
        double[] distanceArr = new double[arr.length];

        for(int j = 0; j < arr.length; j ++){
            double[] pair = mat[j];
            distanceArr[j] = distance(arr, pair);
        }

        return distanceArr;
    }

    public static int findMin(double[] arr){
        int result=0;
        double min;
        if(arr[0] == 0){
            min = arr[1];} else{
                min = arr[0];
            }
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

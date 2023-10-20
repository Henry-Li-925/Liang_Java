package Chapter8;

public class Case_2FindingClosestPair_example {
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

        double[] dot1 = new double[2];
        double[] dot2 = new double[2];
        int i = 0, j = 1;
        double shortestDistance = distance(dotsets[i], dotsets[j]);

        // the simplest algorithm to compare two different points within the dotset: compare the dot with the one of a numerically bigger index, and iterate the loop incrementally.
        for(i = 0; i < dotsets.length; i++){
            for(j = i + 1; j < dotsets.length; j++){
                if(distance(dotsets[i], dotsets[j]) < shortestDistance){
                    shortestDistance = distance(dotsets[i], dotsets[j]);
                    dot1 = dotsets[i];
                    dot2 = dotsets[j];
                }
            }
        }

        System.out.printf("The closest pair are (%.2f, %.2f), (%.2f, %.2f), and the distance between is %.2f."
        , dot1[0], dot1[1], dot2[0], dot2[1], shortestDistance);
    }

    public static double distance(double[] dot1, double[] dot2){
        double result;
        double x1 = dot1[0], y1 = dot1[1];
        double x2 = dot2[0], y2 = dot2[1];

        result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        return result;
    }
}

package Chapter7;

public class SortArray {
    public static void sortArray(double[] arr){
        // nested for loop
        // the outer loop is iterated in order to find the smallest element in the list, which ranges from list[i] to list[list.length-1], and exchanges it with list[i]
        for(int i = 0; i < arr.length - 1; i++){
            double currentMin = arr[i];
            int currentMinIndex = i;

                // select the smallest element in list[i .... list.length-1]
                // the inner loop finds the smallest between list[i+1] and list[list.length], which is going to be exchanged with list[i]
                for(int j = i + 1; j < arr.length; j++){
                    if(currentMin > arr[j]){
                        currentMin = arr[j];
                        currentMinIndex = j;
                    }
                }

            // swap the list[i] with the smallest element, if necessary
            if (currentMinIndex != i){
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
       }    
    }    
}

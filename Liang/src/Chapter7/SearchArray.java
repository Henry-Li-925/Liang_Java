package Chapter7;

public class SearchArray {

    // Compares the key element sequentially with each element in the array and returns the index of the leftmost matched element. If no match is found, returns -1.
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i ++){
            if(list[i] == key)
            return i;
        }
        return -1;
    }


    // the precondition of binary search method is that the array must be sorted in ascending order.
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length-1;

        while (high >= low){
            int mid = (high+low)/2;
            if (key < list[mid]){
                high = mid-1;
            } else if (key > list[mid]){
                low = mid+1;
            } else {
                return mid;
            }
        }
        return -low - 1; // return the insertion point of the unmatched value, and the negative sign indicates the value is not in the list.
}
}

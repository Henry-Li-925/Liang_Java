package Chapter7;


public class CopyingArrays {
    public static void main(String[] args){
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[5];
        int[] list1 = {1,2,3,4,5,6,7};
        int[] list2 = {3,3,4,5,6,7,8};



        // assign the new array to the old reference, both of which share the same memory
        list2 = list1;
        printArray.intPrint(list2);

        System.out.println("Q1");

        printArray.intPrint(list1);  

        System.out.println("Q1");
        
        list1[0] = 7; // as they reference the same array, the change of the item is shared between two list.
        
        printArray.intPrint(list1);
        
        System.out.println("Q1");

        printArray.intPrint(list2);
        
        System.out.println("Q1");

        // use loop to copy elementwise
        loopCopy(sourceArray, targetArray);
        System.out.println("Q2");

        // `arraycopy` method
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        for(int i = 0; i < targetArray.length; i++){
            System.out.print(targetArray[i]+"\t");
        }

    }



    public static void loopCopy(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
            System.out.print(arr2[i]+"\t");
        }
    }


}


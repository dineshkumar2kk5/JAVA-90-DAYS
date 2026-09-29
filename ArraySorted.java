/**
 * ArraySorted
 */
public class ArraySorted {

    public static void main(String[] args) {
        
        System.out.println("ArraySorted");

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]> arr[i+1]){
            System.out.println("Array is not sorted");
            return;
           }
        }
        System.out.println("Array is sorted"); 
    }
}
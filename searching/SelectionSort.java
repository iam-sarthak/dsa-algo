// ----------------------------------------------------------
// find the min element and replace it with ith element 
// -----------------------------------------------------------

public class Selectionsort {

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min  =Integer.MAX_VALUE;
            int minidx = -1;
            for (int j = i; j < arr.length; j++) {
                if (min>arr[j]) {
                    min = arr[j];
                    minidx = j;
                }
            }
            swap(arr, i, minidx);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printing(int[] arr){
        for (int i : arr) {
            System.err.print(i + ", ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {23,34,56,87,89,4,34,6,23,76,2,54,65,76,7,85,4,53,3,55,766,76,86,34};
        selection(arr);
        printing(arr);
    }
}

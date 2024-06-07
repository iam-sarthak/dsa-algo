public class bubbleSort {

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
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
        bubble(arr);
        printing(arr);
    }
}

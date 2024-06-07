import java.util.Arrays;

public class Linear {
    public static boolean linearsearch(int[] arr, int find) {
        for (int i : arr) {
            if(i==find){
                return true;
            }
        }
        return false;
    }



        public static void main(String[] args) {
        int[] arr = {23,34,56,87,89,4,34,6,23,76,2,54,65,76,7,85,4,53,3,55,766,76,86,34};
        int search_item = 76;
        
        System.out.println(linearsearch(arr,search_item));
    }
}

import java.util.Arrays;

class Binary_searching{
    public static boolean binarysearch(int[] arr,int find) {
        int n =arr.length;
        int start=0;
        int end = n-1;
        int mid;
        while (end>start) {
            mid = (start+end)/2;
            if (arr[mid]==find) {
                return true;
            }else if(arr[mid]>find){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int[] arr = {23,34,56,87,89,4,34,6,23,76,2,54,65,76,7,85,4,53,3,55,766,76,86,34};
        int search_item = 76;
        Arrays.sort(arr);
        
        System.out.println(binarysearch(arr,search_item));
    }
}
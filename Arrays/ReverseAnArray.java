package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    static void reverseArray(int []arr){
        int start=0,end=arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr = {2,4,6,8,9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

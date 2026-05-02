package Arrays;

import java.util.Arrays;

public class PrintExtremeEle {

    static void printElements(int []arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        printElements(arr);
//        System.out.println(Arrays.toString(arr));
    }
}

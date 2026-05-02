package Arrays;

import java.util.Arrays;

public class ShiftArrBy1Pos {

    static void shiftArr(int []arr){
        int temp=arr[arr.length-1];
        int i;
        for(i=arr.length-1; i>=1; i--){
            arr[i]=arr[i-1];
        }
        arr[i]=temp;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
        shiftArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package Arrays;

import java.util.Arrays;

public class PivotIndex {

    static int findPivot(int []arr){
        int[] leftSum = new int[arr.length];
        int []rightSum = new int[arr.length];
        //calculate leftSum
        leftSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        //calculate right Sum
        rightSum[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }
        //traverse and find the sum where it is equal
        for(int i=0;i<arr.length;i++){
            if(leftSum[i]==rightSum[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,7,3,6,5,6};
        System.out.println(findPivot(arr));
    }
}

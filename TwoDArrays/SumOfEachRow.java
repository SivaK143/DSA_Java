package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow {

    static List<Integer> sumOfEachRow(int [][]arr){
        List<Integer> result = new ArrayList<>();
        int sum;
        for(int row=0;row<arr.length;row++){
            sum=0;
            for(int col=0;col<arr[row].length; col++){
                sum+=arr[row][col];
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfEachRow(arr));
    }
}

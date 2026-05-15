package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachColumn {

    static List<Integer> columWiseSum(int [][]arr){
        List<Integer> res = new ArrayList<>();
        int sum;
        for(int col=0;col<arr[0].length;col++){
            sum=0;
            for(int row=0;row<arr.length;row++){
                sum+=arr[row][col];
            }
            res.add(sum);
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(columWiseSum(arr));
    }
}

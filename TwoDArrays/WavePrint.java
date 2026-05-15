package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class WavePrint {

    static List<Integer> wavePrint(int [][]arr){
        List<Integer> res = new ArrayList<>();
        int n = arr[0].length;
        int m =arr.length;
        for(int col=0;col<n;col++){
            //check if evn or odd
            //odd (bottom to top
            if((col & 1)==1){
                for(int row=m-1;row>=0;row--){
                    res.add(arr[row][col]);
                }
            }else{//(Even (top to bottom))
                for(int row=0;row<m;row++){
                    res.add(arr[row][col]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        System.out.println(wavePrint(arr));
    }
}

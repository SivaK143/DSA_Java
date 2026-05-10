package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static int[] findTargetSum(int []arr, int target){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target) return new int[]{i,j};
            else if(arr[i]+arr[j]<target) i++;
            else j--;
        }
        return new int[]{-1,-1};
    }

    static int[] findTargetUsingHashMap(int []arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int needed = target-arr[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int arr[] = {1,4,5,6,7,9,11};
//        int arr[] = {3,2,4};
//        System.out.println(Arrays.toString(findTargetSum(arr,6)));
        System.out.println(Arrays.toString(findTargetUsingHashMap(arr,18)));

    }
}

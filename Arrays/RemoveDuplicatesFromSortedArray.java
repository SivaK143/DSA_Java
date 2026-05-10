package Arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {

    static void removeDuplicates(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println("Length of array wothout duplicates "+ map.size());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " is duplicate");
            }
        }
    }

    static int removeDuplicatesTwoPointer(int []arr){
        int i=0,j=1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
                j++;
            }else{
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,3,4};
        removeDuplicates(arr);
        System.out.println(removeDuplicatesTwoPointer(arr));

    }
}

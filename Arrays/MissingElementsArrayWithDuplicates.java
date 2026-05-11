package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingElementsArrayWithDuplicates {

    static List<Integer> findElements(int nums[]){

        List<Integer> ans = new ArrayList<>();
        //marking phase
        for(int index=0;index<nums.length; index++){
            int value = Math.abs(nums[index]);
            int position = value-1;
            //mark the position if its not negative
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
        }

        //Travel throughout the array and find out the positive numbers
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]= {1,4,4,5,2,2};
        System.out.println(findElements(nums));

    }
}

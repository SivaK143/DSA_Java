package Arrays;

import java.util.HashMap;

public class FirstRepeatingElement {

    static int firstRepeatingElement(int []arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        //traverse all the elemnts in array and check the freq if its greater than 1 thats the answer
        for(int i:arr){
            if (freq.get(i) >1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr []= {2,4,6,8,7,6,8};
        System.out.println(firstRepeatingElement(arr));
    }
}

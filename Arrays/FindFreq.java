package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FindFreq {

    static int getMode(int []arr){
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        //to print Hashmap elemets
        for (int i: freq.keySet()){
            System.out.println(i+" -> " + freq.get(i));
        }

        int maxiFreq= -1;
        int maxiFreqKey = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentKeyFreq=freq.get(key);
            if(currentKeyFreq>maxiFreq){
                maxiFreq=currentKeyFreq;
                maxiFreqKey=currentKey;
            }
        }
        return maxiFreqKey;
    }


    static int[] getHighestOrLowestFreq(int []arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0+1));
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if(currentKeyFreq > highestFreq){
                highestFreq=currentKeyFreq;
                highestNum=currentKey;

            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key:freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if(currentKeyFreq < lowestFreq){
                lowestFreq=currentKeyFreq;
                lowestNum=currentKey;
            }
        }
        return new int[]{highestNum, lowestNum};
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,4,4,5};
//        System.out.println(getMode(arr));

        System.out.println(Arrays.toString(getHighestOrLowestFreq(arr)));
    }
}

package Arrays;

public class MissingNumber {

    static int missingNumber(int []arr){
        //xor with array elements
        int xorSum=0;
        for(int n:arr){
            xorSum=xorSum^n;
        }
        //xor with range elements
        for(int i=0;i<=arr.length+1;i++){
            xorSum=xorSum^i;
        }
        //xor both we will get ans
        return xorSum;
    }

    public static void main(String[] args) {
        int []arr = {2,3,5,6,4};
        System.out.println(missingNumber(arr));
    }
}

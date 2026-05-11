package Arrays;

public class MaximumSubArray {

    static int findMaxSubArraySum(int nums[]){
        int sum=0, maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            //1 calculate Sum
            sum+=nums[i];
            //2 update the maxi if Sum greater than maxi
            if(sum>maxi) maxi=sum;
            //3 check if sum less than zero if yes updated to zero
            if(sum<0) sum=0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int []nums= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubArraySum(nums));
    }
}

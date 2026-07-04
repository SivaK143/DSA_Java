package BinarySearch;

public class NumberOfOccurence {

    static int lowerBound(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        int ans=-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                ans = mid;
                e = mid -1;
            }else  s = mid+1;
        }
        return ans;
    }

    static int upperBound(int arr[], int target){
        int s=0, e=arr.length-1;
        int ans =-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target)s=mid+1;
            else{
                ans=mid;
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        int lower = lowerBound(arr, 2);
        int upper = upperBound(arr,2);

    }
}

package BinarySearch;

public class NumberOfOccurence2 {

    static int getfirstoccurence(int []arr, int target){
        int ans=-1, start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return ans;
    }

    static int getLastOccurence(int []arr, int target){
        int ans=-1, start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        int first = getfirstoccurence(arr, 2);
        int last = getLastOccurence(arr,2);
        System.out.println(last-first+1);
    }
}

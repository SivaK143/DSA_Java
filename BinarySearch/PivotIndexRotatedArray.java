package BinarySearch;

public class PivotIndexRotatedArray {

    static int findPivot(int arr[]){
        int start=0,end=arr.length-1,ans=-1;
        if(arr[start]<arr[end]) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //ascending part there is no chance of answer will present
            if(arr[mid]<=arr[arr.length-1]) end=mid-1;
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={50,60,70,10,20,30,40};
        System.out.println(findPivot(arr));
    }
}

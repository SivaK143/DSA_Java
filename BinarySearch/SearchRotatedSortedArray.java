package BinarySearch;

public class SearchRotatedSortedArray {

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

    static int binarySearch(int []arr, int s, int e, int target){
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target) return m;
            else if(arr[m]<target) s=m+1;
            else e=m-1;
        }
        return -1;
    }

    static int findAns(int pivot, int []arr, int target){
        if(pivot==-1){
            return binarySearch(arr,0,arr.length-1,target);
        }
        //if not array divided into 2 parts
        //first part(descenpart)
        int leftStartIndex=0, leftEndindex=pivot;
        if(arr[leftStartIndex]<=target && target<=arr[leftEndindex]){
            return binarySearch(arr,leftStartIndex,leftEndindex,target);
        }
        //second part(ascending part)
        int rightStartIndex=pivot+1;
        int rightEndIndex=arr.length-1;
        if(arr[rightStartIndex]<=target && target<=arr[rightEndIndex]){
            return binarySearch(arr,rightStartIndex,rightEndIndex,target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int pivotIndex = findPivot(arr);
        //if(pivot ==-1) arr is not sorted here then apply normal binary search
        System.out.println(findAns(pivotIndex,arr,0));
    }
}

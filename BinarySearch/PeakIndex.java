package BinarySearch;

public class PeakIndex {

    static int peakIndex(int []arr){
        int start=0, end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) start = mid + 1;
            else end = mid;
        }
        return end;
    }

    public static void main(String[] args) {
        int []arr = {1,3,4,5,2};
        System.out.println(peakIndex(arr));
    }
}

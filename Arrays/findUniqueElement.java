package Arrays;

public class findUniqueElement {

    static int unique(int []arr){
        int xorSum=0;
        for(int n:arr){
            xorSum=xorSum^n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,4,5,3,4};
        System.out.println(unique(arr));
    }
}

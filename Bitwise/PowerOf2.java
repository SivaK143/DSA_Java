package Bitwise;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=5,count=0;
        while (n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Set bit count: "+count);


        n=16;
        if((n & (n-1))==0) System.out.println("power of 2");

    }
}

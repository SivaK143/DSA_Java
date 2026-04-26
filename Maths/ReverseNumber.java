package Maths;

public class ReverseNumber {

    static int reverseNumber(int n){
        int ans=0, rem;
        while(n>0){
            rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(2012));
    }
}

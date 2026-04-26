package Maths;

public class PrintDigits {

    static int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {

        int n=5213;
        while(n>0){
            int rem = n%10;
            n=n/10;
            System.out.println(rem);
        }
        System.out.println(countDigits(5123));
    }

}

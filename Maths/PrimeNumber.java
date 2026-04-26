package Maths;

public class PrimeNumber {

    static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i ==0) return false;
        }
        return true;
    }

    static int Gcd(int a, int b){
        //gcd(a,b)=gcd(b,a%b)
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(Gcd(12,18));
    }
}

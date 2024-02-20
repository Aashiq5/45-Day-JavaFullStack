import java.util.Scanner;

public class PrimeNumber1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        System.out.println("The Prime Number between 1 to "+n+" :");
        printPrime(n);

    }

    private static void printPrime(int n) {
        boolean[] primes=new boolean[n+1];
        for(int i=2;i<=n;i++){
            primes[i]=true;
        }
        for(int p=2;p*p<=n;p++){
            if(primes[p]){
                for(int i=p*p;i<=n;i+=p)
                    primes[i]=false;
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i]){
                System.out.println(i+" ");
            }
        }
    }
}

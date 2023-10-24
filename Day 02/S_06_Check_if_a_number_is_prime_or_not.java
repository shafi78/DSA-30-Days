import java.util.Scanner;

public class S_06_Check_if_a_number_is_prime_or_not {
    public static void main(String args[]) {
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;

        boolean isPrime = true ;

        for(int i=2 ; i<=n-1 ; i++) {
            if (n%i == 0) {
                isPrime = false ;
            }
        }

        if (isPrime == true) {
            System.out.println(n+" is Prime");
        }

        else {
            System.out.println(n+" is not prime");
        }

    }
}

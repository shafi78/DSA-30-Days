public class S_10_Print_all_primes_in_a_range {

    public static boolean isPrime(int n) {
        for (int i=2 ; i<=Math.sqrt(n);i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true ;
    }

    public static void primeNums(int n) {
        for (int i=2 ; i<=n;i++) {
            if (isPrime(i)) {
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primeNums(20);
    }
}

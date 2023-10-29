public class S_09_Check_if_a_number_is_prime_or_not_using_sqrt {

    public static boolean isPrime(int n) {
        for (int i=2 ; i<=Math.sqrt(n);i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true ;
    }
    
    public static void main(String args[]) {
        System.out.println(isPrime(5));
    }
}

public class S_16_Sum_of_digits_in_an_integer {

    public static void sumofNums(int n) {
        int sum = 0 ;

        while (n>0) {
            int rem = n%10 ;
            sum += rem ;
            n /= 10 ;
        }

        System.out.println(sum);
    }

    public static void main(String args[]) {
        sumofNums(123);
    }
}

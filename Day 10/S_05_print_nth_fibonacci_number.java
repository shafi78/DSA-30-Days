public class S_05_print_nth_fibonacci_number {

    public static int fib(int n) {
        if (n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String args[]) {
        System.out.println(fib(3));
    }
}


// Time complexity : O(2^n)
// Space complexity : O(n)
public class S_03_print_factorial_of_a_number {

    public static int fact(int n) {
        if (n==0) {
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String args[]) {
        System.out.println(fact(5));
    }
}


// Time complexity : O(n)
// Space complexity : O(n)
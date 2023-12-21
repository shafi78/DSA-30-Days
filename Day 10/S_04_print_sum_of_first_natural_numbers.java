public class S_04_print_sum_of_first_natural_numbers {

    public static int printNatural(int n) {
        if (n == 1){
            return 1;
        }

        return n+printNatural(n-1);
    }
    public static void main(String args[]) {
        System.out.println(printNatural(5));
    }
}

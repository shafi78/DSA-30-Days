public class S_02_Print_sum_of_n_natural_numbers {
    public static void main(String args[]) {
        int sum = 0;
        int n = 5 ;

        for (int i=1 ; i<=n ; i++) {
            sum += i ;
        }

        System.out.println(sum);
    }
}

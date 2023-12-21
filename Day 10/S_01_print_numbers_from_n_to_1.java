public class S_01_print_numbers_from_n_to_1 {

    public static void printDec(int n) {

        if (n==0) {
            return ;
        }

        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String args[]) {
        printDec(10);
    }
}
public class S_01_check_if_a_number_is_odd_or_even {

    public static void oddOrEven(int n) {
        int bitMask = 1 ;

        if ((n&bitMask) == 0) {
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    }
    public static void main(String args[]) {
        oddOrEven(14);
    }
}

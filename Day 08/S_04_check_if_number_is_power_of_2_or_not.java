public class S_04_check_if_number_is_power_of_2_or_not {

    public static boolean isPower(int n) {
        return (n&(n-1)) == 0 ;
    }
    public static void main(String args[]) {
        System.out.println(isPower(8));
    }
}

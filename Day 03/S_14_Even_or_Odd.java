public class S_14_Even_or_Odd {

    public static void checkNum(int num) {
        if (num%2 == 0) {
            System.out.println(num+" is even number");
        }

        else {
            System.out.println(num+" is odd number");
        }
    }
    public static void main(String args[]) {
        checkNum(5);
    }
}

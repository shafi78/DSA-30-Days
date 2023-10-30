public class S_15_Number_is_palindrome_or_not {

    public static void isPalindrome(int num) {
        int myNum = num ;
        int rev = 0 ;

        while (num>0) {
            int lastDigit = num%10 ;
            rev = (rev*10) + lastDigit ;
            num = num/10 ;
        }

        if (myNum == rev) {
            System.out.println("Palindrome");
        }

        else {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String args[]) {
        isPalindrome(123);
    }
}

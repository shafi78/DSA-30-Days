// Swap two numbers without using any third variable and also without addition and substration.


public class S_08_swap_two_numbers_using_XOR {

    public static void swap(int a,int b) {
        
        System.out.println("Before swapping : "+a+" "+b);

        a = a^b ;
        b = a^b ;
        a = a^b ;

        System.out.println("After swapping : "+a+" "+b);

    }
    public static void main(String args[]) {
        swap(20, 50);
    }
}

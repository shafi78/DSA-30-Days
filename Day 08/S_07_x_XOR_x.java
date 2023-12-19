// What is the value of x^x for any value of x ?

// -> 0

public class S_07_x_XOR_x {

    public static int XOR(int x) {
        return x^x ;
    }
    public static void main(String args[]) {
        System.out.println(XOR(5));
    }
}
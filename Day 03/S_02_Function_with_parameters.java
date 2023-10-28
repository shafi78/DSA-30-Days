import java.util.*;

public class S_02_Function_with_parameters {

    public static int calcsum(int a,int b) {        // formal params or parameters
        int sum = a+b ;
        return sum ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcsum(a,b);                     // actual params or arguments
        System.out.println("The sum of a and b is : "+sum);
    }
}

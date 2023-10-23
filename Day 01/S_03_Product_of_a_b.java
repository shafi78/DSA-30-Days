import java.util.Scanner;

public class S_03_Product_of_a_b {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int sum = a*b ;

        System.out.println("The Product of a & b is : "+sum);
    }
}
import java.util.Scanner;

public class S_02_Sum_of_a_b {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int sum = a+b ;

        System.out.println("The sum of a & b is : "+sum);
    }
}
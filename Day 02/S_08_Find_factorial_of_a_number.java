import java.util.Scanner;

public class S_08_Find_factorial_of_a_number {
    public static void main(String args[]) {
        int fact = 1;

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1 ; i<=num ; i++) {
            fact *= i ;
        }

        System.out.println("Factorial of "+num+" is : "+fact);
    }
}

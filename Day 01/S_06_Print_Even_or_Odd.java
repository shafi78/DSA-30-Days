import java.util.Scanner;

public class S_06_Print_Even_or_Odd {
    public static void main(String args[])
    {
        System.out.println("Enter a number : ");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num+" is even number");
        }

        else {
            System.out.println(num+" is odd number");
        }
    }
}

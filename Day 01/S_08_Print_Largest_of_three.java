import java.util.Scanner;

public class S_08_Print_Largest_of_three {
    public static void main(String args[]){
        System.out.println("Enter a , b and c");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c){
            System.out.println("A is greater");
        }

        else if (b >= a && b >= c){
            System.out.println("B is greater");
        }

        else if (c >= a && c >= b){
            System.out.println("C is greater");
        }
    }
}

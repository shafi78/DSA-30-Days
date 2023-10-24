import java.util.Scanner;

public class S_07_Print_sum_of_even_and_odd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of elements : ");
        int n = sc.nextInt();

        int esum = 0 ;
        int osum = 0 ;

        System.out.println("Enter the numbers : ");
        for (int i=0 ; i<n ; i++) {
            int num = sc.nextInt();

            if (num%2 == 0) {
                esum += num ;
            }

            else {
                osum += num ;
            }
        }

        System.out.println("Sum of even numbers : "+esum);
        System.out.println("Sum of odd numbers : "+osum);
    }
}

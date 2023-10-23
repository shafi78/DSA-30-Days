import java.util.Scanner;

public class S_07_Income_Tax_Calculator {
    public static void main(String args[]){
        System.out.println("Enter your income : ");
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        double tax ;

        if (income < 500000){
            tax = 0 ;
        }

        else if (income >= 500000 && income <= 1000000){
            tax = income*0.2;
        }

        else {
            tax = income*0.3 ;
        }

        System.out.println("Your tax is : "+tax);
    }
}

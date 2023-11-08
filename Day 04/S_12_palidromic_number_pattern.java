//     1
//    212
//   32123
//  4321234
// 543212345


public class S_12_palidromic_number_pattern {

    public static void palindromicNumber(int n) {
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }

            for (int j=i ; j>=1 ; j--) {
                System.out.print(j);
            }

            for (int j=2 ; j<=i ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        palindromicNumber(5);
    }
}

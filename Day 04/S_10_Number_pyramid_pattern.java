//     1
//    123
//   12345
//  1234567
// 123456789


public class S_10_Number_pyramid_pattern {

    public static void numberPyramid(int n) {
        for (int i=1 ; i<=n ; i++) {

            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }

            for (int j=1 ; j<=2*(i-1)+1 ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        numberPyramid(5);
    }
}

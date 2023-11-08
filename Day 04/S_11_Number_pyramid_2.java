//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class S_11_Number_pyramid_2 {

    public static void numberPyramid2(int n) {
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }

            for (int j=1 ; j<=i ; j++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        numberPyramid2(5);
    }
}

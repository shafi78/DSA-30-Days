// 12345
// 1234
// 123
// 12
// 1


public class S_03_Inverted_half_pyramid_with_numbers {

    public static void halfPyramid(int n) {
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        halfPyramid(5);
    }
}

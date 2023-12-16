import java.util.Scanner;

public class S_05_2D_Arrays {

    public static boolean search(int matrix[][],int key) {
        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[0].length ; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell ("+i+" , "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false ;
    }

    public static int largestElement(int matrix[][]) {
        int largest = Integer.MIN_VALUE ;

        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j] ;
                }
            }
        }
        return largest ;
    }

       public static void main(String args[]) {
        int matrix[][] = new int[3][3] ;
        int n = matrix.length ;
        int m = matrix[0].length ;

        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<m ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        // Searching key in 2D matrix

        search(matrix, 5);


        // Finding largest element

        int largest = largestElement(matrix);

        System.out.println("Largest element is : "+largest);

       }
}
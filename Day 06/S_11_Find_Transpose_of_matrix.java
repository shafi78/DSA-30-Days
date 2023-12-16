public class S_11_Find_Transpose_of_matrix {

    public static void transposeMatrix(int matrix[][]) {
        System.out.println("The matrix is : ");

        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }


    public static void main(String args[]) {
        int matrix[][] = {
            {2,3,7},
            {5,6,7}
        };

        int row=2 , col=3 ;
        int transpose[][] = new int[col][row] ;

        for (int i=0 ; i<row ; i++) {
            for (int j=0 ; j<col ; j++) {
                transpose[j][i] = matrix[i][j] ;
            }
        }

        transposeMatrix(matrix);
        transposeMatrix(transpose);
    }
}

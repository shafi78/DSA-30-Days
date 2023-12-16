public class S_10_Print_sum_in_second_row {

    public static void printSum(int matrix[][]) {
        int sum = 0;

        for (int j=0 ; j<matrix[0].length ; j++) {
            sum += matrix[1][j] ;
        }

        System.out.println("Sum : "+sum);
    }
    public static void main(String args[]) {
        int matrix[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };

        printSum(matrix);
    }
}

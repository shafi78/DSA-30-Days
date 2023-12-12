public class S_09_Max_Subarray_sum_brute_force {

    public static void subarray(int numbers[]) {

        int maxSum = Integer.MIN_VALUE ;

        for (int i=0 ; i<numbers.length ; i++) {
            int start= i ;

            for (int j=i ; j<numbers.length ; j++) {
                int end = j ;
                int sum = 0 ;

                for (int k=start ; k<=end ; k++) {
                    sum += numbers[k] ;
                }
                System.out.println(sum);

                if (maxSum < sum) {
                    maxSum = sum ;
                }
            }
        }

        System.out.println("max sum : "+maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};

        subarray(numbers);
    }
}


// Time complexity : O(n^3)  // (n cube)
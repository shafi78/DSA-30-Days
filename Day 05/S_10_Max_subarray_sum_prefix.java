public class S_10_Max_subarray_sum_prefix {

    public static void subarray(int numbers[]) {

        int maxSum = Integer.MIN_VALUE ;
        int prefix[] = new int[numbers.length] ;

        prefix[0] = numbers[0] ;

        for (int i=1 ; i<prefix.length ; i++) {
            prefix[i] = prefix[i-1] + numbers[i] ;
        }

        for (int i=0 ; i<numbers.length ; i++) {
            int start= i ;

            for (int j=i ; j<numbers.length ; j++) {
                int end = j ;
                int sum = 0 ;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1] ;
                
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


// Time complexity : O(n^2) // (O of n square)
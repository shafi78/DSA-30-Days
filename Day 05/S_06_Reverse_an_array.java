public class S_06_Reverse_an_array {

    public static void reverse(int numbers[]) {

        int first = 0 , last = numbers.length-1 ;

        while (first < last) {
            int temp = numbers[last] ;
            numbers[last] = numbers[first] ;
            numbers[first] = temp ;

            first++ ;
            last-- ;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {1,4,5,8,15};

        reverse(numbers);

        for (int i=0 ; i<numbers.length ; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
}

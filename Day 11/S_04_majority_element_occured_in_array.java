public class S_04_majority_element_occured_in_array {

    public static int majorityEle(int arr[]) {
        int majorEle = arr.length/2 ;

        for (int i=0 ; i<arr.length ; i++) {
            int count = 0 ;
            for (int j=0 ; j<arr.length ; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            
            if (count > majorEle) {
                return arr[i];
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityEle(arr));
    }
}

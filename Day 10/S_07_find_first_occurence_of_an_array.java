public class S_07_find_first_occurence_of_an_array {

    public static int firstOccurence(int arr[],int key,int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static void main(String args[]) {
        int arr[] = {8,3,6,9,5,10,2,5,13};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}


// Time complexity : O(n)
// Space complexity : O(n)
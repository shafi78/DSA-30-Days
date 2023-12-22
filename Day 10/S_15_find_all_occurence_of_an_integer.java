public class S_15_find_all_occurence_of_an_integer {

    public static int findAllOccur(int arr[],int key,int i) {
        if (i == arr.length){
            return i;
        }

        if (arr[i] == key){
            System.out.print(i+" ");
        }

        return findAllOccur(arr, key, i+1);
    }

    public static void main(String args[]) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        findAllOccur(arr, 2, 0);
    }
}

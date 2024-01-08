import java.util.ArrayList;

public class S_08_Find_maximum_in_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int largest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (largest < list.get(i)) {
                largest = list.get(i);
            }
        }

        System.out.println("Largest element : " + largest);
    }
}

// Time complexity : O(n)
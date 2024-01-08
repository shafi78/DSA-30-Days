import java.util.ArrayList;

public class S_07_print_reverse_of_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = list.size();

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}

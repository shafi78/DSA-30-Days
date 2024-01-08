import java.util.ArrayList;

public class S_05_ArrayList_contains {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
    }
}

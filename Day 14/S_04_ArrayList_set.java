import java.util.ArrayList;

public class S_04_ArrayList_set {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.set(2, 10);

        System.out.println(list);
    }
}

import java.util.ArrayList;

public class S_03_ArrayList_remove {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        System.out.println(list);
    }
}

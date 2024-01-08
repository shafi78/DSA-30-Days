import java.util.ArrayList;

public class S_02_ArrayList_get {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int ele = list.get(1);
        System.out.println(ele);
    }
}

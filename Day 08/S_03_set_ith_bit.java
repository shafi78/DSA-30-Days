public class S_03_set_ith_bit {

    public static int setBit(int n,int i) {
        int bitMAsk = 1<<i ;
        return n | bitMAsk ;
    }
    public static void main(String args[]) {
        System.out.println(setBit(10, 2));
    }
}

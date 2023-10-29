public class S_07_Function_overloading_using_data_types {

    public static int sum(int a,int b) {
        return a+b ;
    }

    public static float sum(float a,float b) {
        return a+b ;
    }
    public static void main(String args[]) {
        System.out.println(sum(5,6));
        System.out.println(sum(2.5f,3.2f));
    }
}

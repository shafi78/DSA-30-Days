public class S_04_Product_of_a_and_b {
    
    public static int product(int a,int b) {
        int product = a*b ;
        return product ;
    }


    public static void main(String args[]) {
        int a = 5 ;
        int b = 8 ;

        int Product = product(a, b);

        System.out.println(Product);
    }
}

public class S_12_Decimal_to_Binary {

    public static void DecToBin(int n) {
        int myNumber = n ;
        int pow = 0 ;
        int binNum = 0 ;

        while(n > 0) {
            int rem = n % 2 ;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++ ;
            n = n/2 ;
        }
        
        System.out.println("Binary of "+myNumber+" = "+binNum);
    }
    public static void main(String args[]) {
        DecToBin(11);
    }
}

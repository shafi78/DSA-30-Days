public class S_04_Mathod_overloading {
    public static void main(String args[]) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(5,5,5));
        System.out.println(c1.sum(5, 5));
        System.out.println(c1.sum(7.5f, 5.2f));
    }
}


class Calculator {
    
    int sum(int a,int b) {
        return a+b;
    }

    float sum(float a,float b) {
        return a+b ;
    }

    int sum(int a,int b,int c) {
        return a+b+c ;
    }

}

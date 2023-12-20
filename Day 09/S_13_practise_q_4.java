public class S_13_practise_q_4 {
    public static void main(String args[]) {
        Vehicle v1 = new Car();
        v1.print();

        Vehicle v2 = new Vehicle();
        v2.print();
    }
}


class Vehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class (Car)");
    }
}
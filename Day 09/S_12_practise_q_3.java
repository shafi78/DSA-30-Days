public class S_12_practise_q_3 {
    public static void main(String args[]) {
        // Car c = new Car();
        // System.out.println(c.model = 2020);
        // System.out.println(c.name = "Lamborginni");

        // Vehicle v = new Vehicle();
        // System.out.println(v.model = 2020);

        // Vehicle v = new Car();
        // System.out.println(v.model = 2020);

        // Car c = new Vehicle();               // Runtime Error
        // System.out.println(c.model= 2020);
    }
}


class Vehicle {
    int model ;
}

class Car extends Vehicle {
    String name ;
}
public class S_06_Abstraction {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);   // brown

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        
    }
}


abstract class Animal {

    String color ;

    Animal() {
        color = "brown" ;
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor() {
        color = "black" ;
    }

    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walks on two legs");
    }
}
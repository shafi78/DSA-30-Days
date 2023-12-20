public class S_03_Inheritance {
    public static void main(String args[]) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog sheru = new Dog();
        // sheru.eat();
        // sheru.legs = 4 ;
        // System.out.println(sheru.legs);

        // Mammal m1 = new Mammal();
        // m1.eat();
        // m1.walk();

        Human man = new Human();
        man.eat();
        man.talk();

    }
}



// 1. Single inheritance


// // Base class 

// class Animal {
//     String color ;

//     void eat() {
//         System.out.println("Eats");;
//     }

//     void breath() {
//         System.out.println("Breaths");
//     }
// }



// // Derived class 

// class Fish extends Animal {
//     int fins ;

//     void swim() {
//         System.out.println("Swims");
//     }
// }





// 2. Mutlilevel inheritance


// Base class 

// class Animal {
//     String color ;

//     void eat() {
//         System.out.println("Eats");;
//     }

//     void breath() {
//         System.out.println("Breaths");
//     }
// }



// // Derived class 

// class Mammal extends Animal {
//     int legs ;
// }

// class Dog extends Mammal {
//     String breath ;
// }



// 3. Hierarchical inheritance


// Base class 

// class Animal {
//     String color ;

//     void eat() {
//         System.out.println("Eats");;
//     }

//     void breath() {
//         System.out.println("Breaths");
//     }
// }



// // Derived class 

// class Mammal extends Animal {

//     void walk() {
//         System.out.println("Walks");
//     }
// }


// class Fish extends Animal {

//     void swim() {
//         System.out.println("Swims");
//     }
// }


// class Bird extends Animal {
    
//     void fly() {
//         System.out.println("Flies");
//     }
// }



// 4. Hybrid inheritance


// Base class 

class Animal {
    String color ;

    void eat() {
        System.out.println("Eats");;
    }

    void breath() {
        System.out.println("Breaths");
    }
}



// Derived class 

class Mammal extends Animal {

    void walk() {
        System.out.println("Walks");
    }
}


class Dog extends Mammal {

    void bark() {
        System.out.println("Barks");
    }
}

class Cat extends Mammal {

    void meow() {
        System.out.println("Meows");
    }
}

class Human extends Mammal {

    void talk() {
        System.out.println("Talks");
    }
}


class Fish extends Animal {

    void swim() {
        System.out.println("Swims");
    }
}

class Shark extends Fish {

    void hunt() {
        System.out.println("Hunter fish");
    }
}


class Bird extends Animal {
    
    void fly() {
        System.out.println("Flies");
    }
}

class Peacock extends Bird {

    void dance() {
        System.out.println("Dances");
    }
}
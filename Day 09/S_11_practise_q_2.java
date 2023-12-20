// which variable can the class Person access in the following code

// a. name
// b. weight
// c. rno
// d. school

public class S_11_practise_q_2 {
    public static void main(String args[]) {
        Person p1 = new Person();
        p1.name = "Shafi" ;
        p1.weight = 50 ;
    }
}

class Person {
    String name ;
    int weight ;
}


class Student extends Person {
    int rno ;
    String school ;
}
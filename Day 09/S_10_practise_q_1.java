// Find out the correct statement to assign name to objects
// a. s1->name = "value"
// b. Student.name = "value"
// c. s1.name = "value"


public class S_10_practise_q_1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.name = "Shafi");
    }
}

class Student {
    String name ;
    int marks ;
}
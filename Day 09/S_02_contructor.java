
public class S_02_contructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Shafi" ;
        System.out.println(s1.name);

        Student s2 = new Student(s1);
        System.out.println(s2.name);

        // Student s1  = new Student();
    }
}

class Student {
    String name ;
    int rno ;
    String password ;


    // // parameterized constrcutor

    // Student(String name) {
    //     this.name = name ;
    // }



    // // non parameterized constructor

    Student() {
        System.out.println("Contructor is called...");
    }



    // copy constructor

    Student(Student s1) {
        this.name = s1.name ;
        this.rno = s1.rno ;
    }


}


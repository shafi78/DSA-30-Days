public class S_08_Static_keyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.school = "AIISM" ;
        System.out.println(s1.school);

        Student s2 = new Student();
        System.out.println(s2.school);

    }
}

class Student  {
    String name ;
    int rno ;

    static String school ;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

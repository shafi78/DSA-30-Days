public class S_02_Array_functions {

    public static void update(int marks[]) {
        for (int i=0 ; i<marks.length ; i++) {
            marks[i] += 1 ;
        }
    }

    public static void main(String args[]) {
        int marks[] = {97,98,85} ;
        update(marks);

        // printing marks 

        for (int i=0 ; i<marks.length ; i++) {
            System.out.println(marks[i]);
        }
    }
}

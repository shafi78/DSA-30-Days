import java.util.Scanner;

public class S_01_Strings {

    // Printing all characters of a string

    public static void printCharacter(String str) {
        for (int i=0 ; i<str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]) {
        
        String str = "abcd" ;

        String str2 = new String("xyz") ;

        // Strings are IMMUTABLE (non changable)


        // 1. String I/O

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);



        // 2. String Length

        String fullName = "Shafiulla Attar" ;
        System.out.println(fullName.length());



        // 3. String Concatenation

        String firstName = "Shafi" ;
        String lastName = "Attar" ;
        fullName = firstName + " " + lastName ;

        System.out.println(fullName);



        // 4. String chatAt method

        System.out.println(fullName.charAt(0));
        printCharacter(fullName);



        // 5. String comparison

        String s1 = "Shafi" ;
        String s2 = "Shafi" ;
        String s3 = new String("Shafi") ;

        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (s1.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }



        // 6. Substring

        String str4 = "Shafi Attar" ;

        System.out.println(str4.substring(0,3));

    }
}
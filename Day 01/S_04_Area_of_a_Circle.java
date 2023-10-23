import java.util.Scanner;

public class S_04_Area_of_a_Circle {
    public static void main(String args[])
    {
        System.out.println("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius ;

        System.out.println("Area of the circle is : "+area);
    }
}

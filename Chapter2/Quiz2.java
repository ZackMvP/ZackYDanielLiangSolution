package Chapter2;
import java.util.Scanner;
import java.lang.Math;

public class Quiz2 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and length of a Cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = length * area;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}

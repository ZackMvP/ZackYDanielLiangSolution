package Chapter2;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = sc.nextDouble();
        double kilog = pound * 0.454;
        System.out.println(pound + " pounds is " + kilog + " kilogram" );
    }
}

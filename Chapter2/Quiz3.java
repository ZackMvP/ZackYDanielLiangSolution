package Chapter2;
import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = sc.nextDouble();
        double metre = feet * 0.305;
        System.out.println(feet + " feet is " + metre + " meters");
    }
}

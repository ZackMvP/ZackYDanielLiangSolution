package Chapter2;
import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t = sc.nextDouble();

        double acc = (v1-v0)/t;

        System.out.println("The average acceleration is " + acc);

    }
}

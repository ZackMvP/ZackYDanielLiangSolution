package Chapter2;
import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilogram: ");
        double wkg = sc.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double t0 = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        double t1 = sc.nextDouble();

        double energy = wkg * (t1-t0) * 4184;

        System.out.println("The energy needed is " + energy);
    }
}

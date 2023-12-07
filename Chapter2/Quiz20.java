package Chapter2;
import java.util.Scanner;

public class Quiz20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double balance = sc.nextDouble();
        double annInterestRate = sc.nextDouble();

        double interest = balance * (annInterestRate/1200);

        System.out.println("The interest is " + interest);

    }
}

package Chapter2;
import java.util.Scanner;

public class Quiz13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double initial = sc.nextDouble();

        double monthlyInterest = 1 + 0.00417;
        //1st Month
        double first = initial * monthlyInterest;
        //2nd month
        double second = (initial + first) * monthlyInterest;
        //3rd month
        double third = (initial + second) * monthlyInterest;
        //4th month
        double fourth = (initial + third) * monthlyInterest;
        //5th month
        double fifth = (initial + fourth) * monthlyInterest;
        //6th month
        double sixth = (initial + fifth ) * monthlyInterest;

        System.out.printf("After the sixth month, the account value is $%.2f", sixth);

    }
}

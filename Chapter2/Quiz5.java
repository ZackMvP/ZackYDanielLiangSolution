package Chapter2;
import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuityRate = sc.nextDouble();
        double gratuity = (gratuityRate/100) * subtotal;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

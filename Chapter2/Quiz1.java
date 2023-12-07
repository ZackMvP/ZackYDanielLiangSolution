package Chapter2;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius: ");
        int input = sc.nextInt();
        double fahrenheit = (9.0/5) * input + 32;
        System.out.println(input + " Celcius is " + fahrenheit + " Fahrenheit");

    }
}

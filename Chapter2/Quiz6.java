package Chapter2;
import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int input = sc.nextInt();
        int total = 0;

        //Process
        total += input%10;
        input /= 10;
        total += input%10;
        input /= 10;
        total += input%10;
        input /= 10;
        total += input%10;
        input /= 10;
        //End process

        System.out.println("The sum of the digits is " + total);
    }
}

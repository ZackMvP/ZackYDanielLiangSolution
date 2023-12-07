package Chapter2;
import java.util.Scanner;


public class Quiz14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble() * 0.45359237;
        System.out.print("Enter heignt in inches: ");
        double height = sc.nextDouble() * 0.0254;
        double BMI = weight/(height*height);
        System.out.println("BMI is " + BMI);
    }
}

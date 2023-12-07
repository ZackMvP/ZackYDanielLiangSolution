package Chapter2;
import java.util.Scanner;
import java.lang.Math;

public class Quiz17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit between -58 F and 41 F: ");
        double temp = sc.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windspeed = sc.nextDouble();

        double wsi = 35.74 + 0.6215*temp - 35.75*Math.pow(windspeed, 0.16) + 0.4275*temp*Math.pow(windspeed, 0.16);

        System.out.println("The wind chill index is " + wsi);
    }
}

package Chapter2;
import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();

        //Process
        int hours = minutes/60;
        int days = hours/24;
        int years = days/365;
        days %= 365;
        //end process

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
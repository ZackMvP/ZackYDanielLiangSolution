package Chapter2;
import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = sc.nextInt();
        int gmsec = gmt*3600;

        long milisec = System.currentTimeMillis();
        long sec = (milisec / 1000) + gmsec;
        long cursec = sec % 60;
        long min = sec / 60;
        long curmin = min%60;
        long hour = min/60;
        long curhour = hour%24;

        System.out.println("The current time is " + curhour+ ":" + curmin + ":" + cursec);

    }
}

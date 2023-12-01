package Chapter1;

public class Quiz13 {
    public static void main(String[] args) {
        double ax = 3.4;
        double by = 50.2;
        double e = 44.5;
        double cx = 2.1;
        double dy = 0.55;
        double f = 5.9;

        //Using cramer rule
        System.out.println("X = " + ((e*dy-by*f)/(ax*dy-by*cx)));
        System.out.println("Y = " + ((f*ax-cx*e)/(ax*dy-by*cx)));

    }
}

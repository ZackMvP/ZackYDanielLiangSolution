package Chapter1;

public class Quiz11 {
    public static void main(String[] args) {
        double currentPop = 312032486.0;
        int daytosec = 365*86400;
        double birthinayears = daytosec/7.0;
        double deathinayears = daytosec/13.0;
        double immigrantinayears = daytosec/45.0;
        currentPop = currentPop + birthinayears - deathinayears + immigrantinayears;
        System.out.println("Total pop in year-1 = " + ((int)currentPop));
        currentPop = currentPop + birthinayears - deathinayears + immigrantinayears;
        System.out.println("Total pop in year-2 = " + ((int)currentPop));
        currentPop = currentPop + birthinayears - deathinayears + immigrantinayears;
        System.out.println("Total pop in year-3 = " + ((int)currentPop));
        currentPop = currentPop + birthinayears - deathinayears + immigrantinayears;
        System.out.println("Total pop in year-4 = " + ((int)currentPop));
        currentPop = currentPop + birthinayears - deathinayears + immigrantinayears;
        System.out.println("Total pop in year-5 = " + ((int)currentPop));
    }
}

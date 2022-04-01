public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int toppedUpBalance = 900;
        int totalBalance;
        int bonus = 0;

        if (toppedUpBalance >= 1000)
            bonus = toppedUpBalance / 100;


        totalBalance = startBalance + toppedUpBalance + bonus;

        System.out.println(totalBalance);


    }
}
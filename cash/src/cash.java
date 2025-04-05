import java.util.Scanner;

public class cash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change;
        int coins = 0;

        System.out.print("Change owed: ");
        change = sc.nextInt();

        int quarters = change / 25;
        coins += quarters;
        change = change - (quarters * 25);

        int nickels = (change) / 10;
        coins += nickels;
        change = change - (nickels * 10);

        int dimes = change / 5;
        coins += dimes;
        change = change - (dimes * 5);

        coins += change;

        System.out.println(coins);


    }
}

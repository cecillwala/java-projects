import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class calculator_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//      Get principal
        double principal;
        while(true){
            System.out.print("Principal($1K - $1M): ");
            principal = sc.nextDouble();
            if(principal > 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

//      get Rate
        double rate;
        while(true){
            System.out.print("Annual Interest Rate(0% - 100%): ");
            rate = sc.nextDouble();
            if(rate > 0 && rate <= 100) {
                rate = rate / 100 / 12;
                break;
            }
            System.out.println("Enter a number greater than 0 and less than or equal to 100");
        }

        //      Get period in years
        double period;
        while(true){
            System.out.print("Period(1 year - 30 years): ");
            period = sc.nextDouble() * 12;
            if(period >= 12 && period <= 360)
                break;
            System.out.println("Enter a number between 1 and 30");
        }

        //Calculate mortgage
        String mortgage = NumberFormat.getCurrencyInstance(Locale.US).format(principal * ((rate * Math.pow((1 + rate), period)) / (Math.pow((1 + rate), period) - 1)));
        System.out.println("Mortgage: "+ mortgage);
    }
}

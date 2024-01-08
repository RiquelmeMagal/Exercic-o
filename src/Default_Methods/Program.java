package Default_Methods;

import Default_Methods.services.BrazilInterestService;
import Default_Methods.services.InterestService;
import Default_Methods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2);
        double payment = is.payment(amount, months);

        System.out.println("Payment after: " + months + " months:");
        System.out.println(String.format("%.2f", payment));


        sc.close();
    }
}

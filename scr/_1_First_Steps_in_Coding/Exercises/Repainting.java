package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paintQnty = Integer.parseInt(scanner.nextLine());
        int thinnerQnty = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = ((paintQnty + (paintQnty * 0.1)) * 14.50);
        double thinnerPrice = thinnerQnty * 5;
        double totalExpenses = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double hourlyPayment = totalExpenses * 0.30;
        System.out.println(totalExpenses + (hourlyPayment * workingHours));

    }
}

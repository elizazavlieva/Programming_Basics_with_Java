package scr._1_First_Steps_in_Coding.More_Exercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonito = Double.parseDouble(scanner.nextLine());
        double safrid = Double.parseDouble(scanner.nextLine());
        int clam = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerelPrice * 1.60;
        double safridPrice = spratPrice * 1.80;
        double clamPrice = 7.50;
        double totalPrice = (bonitoPrice * bonito) + (safridPrice * safrid) + (clamPrice * clam);
        System.out.printf("%.2f", totalPrice);
    }
}

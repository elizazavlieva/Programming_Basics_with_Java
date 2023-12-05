package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothsPricePerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double totalClothsPrice = clothsPricePerStatist * statists;

        if (statists > 150){
            totalClothsPrice = totalClothsPrice * 0.90;
        }

        double totalExpense = totalClothsPrice + decorPrice;

        double diff = Math.abs(budget - totalExpense);
        if (totalExpense > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}

package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (season){
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }
        if (people <= 6){
            totalPrice = totalPrice * 0.90;
        } else if (people <= 11) {
            totalPrice = totalPrice * 0.85;
        } else {
            totalPrice = totalPrice * 0.75;
        }
        if (people % 2 == 0 && !(season.equals("Autumn"))) {
            totalPrice = totalPrice * 0.95;
        }
        double diff = Math.abs(totalPrice - budget);
        if (budget >= totalPrice){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}

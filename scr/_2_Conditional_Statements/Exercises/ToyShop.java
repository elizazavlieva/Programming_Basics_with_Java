package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzles + talkingDolls + teddyBears + minions + truck;
        double total = (2.60 * puzzles) + (3.00 * talkingDolls)
                + (4.10 * teddyBears) + (8.20 * minions) + (2.00 * truck);
        if (totalToys >= 50){
            total = total * 0.75;
        }
        total = total * 0.90;
        double diff = Math.abs(total - holidayPrice);
        if (total >= holidayPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}

package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250;
        double processorPrice = (videoCardPrice * videoCard) * 0.35;
        double ramPrice = (videoCardPrice * videoCard) * 0.10;
        double totalExpenses = (videoCardPrice * videoCard) + (processorPrice * processor)
                + (ramPrice * ram);
        if (videoCard > processor) {
            totalExpenses = totalExpenses * 0.85;
        }
        double diff = Math.abs(totalExpenses - budget);
        if (budget >= totalExpenses) {
            System.out.printf("You have %.2f leva left!", diff );
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}

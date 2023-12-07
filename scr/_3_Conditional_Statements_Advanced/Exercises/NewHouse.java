package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (flower){
            case "Roses":
                totalPrice = 5.00 * quantity;
                if (quantity > 80) {
                    totalPrice = totalPrice * 0.90;
                }
                break;
            case "Dahlias":
                totalPrice = 3.80 * quantity;
                if (quantity > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Tulips":
                totalPrice = 2.80 * quantity;
                if (quantity > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                totalPrice = 3.00 * quantity;
                if (quantity < 120){
                    totalPrice = totalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                totalPrice = 2.50 * quantity;
                if (quantity < 80) {
                    totalPrice = totalPrice * 1.20;
                }
                break;
        }
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}

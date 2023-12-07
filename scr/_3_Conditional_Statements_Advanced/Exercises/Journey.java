package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation = "";
        String destination =  "";
        double price = 0.00;

        if (budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    accommodation = "Camp";
                    price = budget * 0.30;
                    break;
                case "winter":
                    accommodation = "Hotel";
                    price = budget * 0.70;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season){
                case "summer":
                    accommodation = "Camp";
                    price = budget * 0.40;
                    break;
                case "winter":
                    accommodation = "Hotel";
                    price = budget * 0.80;
                    break;
            }
        } else {
            destination = "Europe";
            accommodation = "Hotel";
            price = budget * 0.90;
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", accommodation, price);
    }
}

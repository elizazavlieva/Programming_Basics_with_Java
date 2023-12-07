package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (timeOfDay.equals("Morning")) {
            if (temperature >= 10 && temperature <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (temperature > 18 && temperature <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (timeOfDay.equals("Afternoon")) {
            if (temperature >= 10 && temperature <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (temperature > 18 && temperature <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }

        } else if (timeOfDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
        }
    }


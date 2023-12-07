package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String review = scanner.nextLine();

        double totalPrice = 0.00;
        switch (accommodation) {
            case "room for one person":
                totalPrice = (days - 1) * 18.00;
                break;
            case "apartment":
                totalPrice = (days - 1) * 25.00;
                if (days < 10){
                    totalPrice = totalPrice * 0.70;
                } else if (days <= 15){
                    totalPrice = totalPrice * 0.65;
                } else {
                    totalPrice = totalPrice * 0.50;
                }
                break;
            case  "president apartment":
                totalPrice = (days - 1) * 35.00;
                if (days < 10) {
                    totalPrice = totalPrice * 0.90;
                } else if (days <= 15) {
                    totalPrice = totalPrice * 0.85;
                } else {
                    totalPrice = totalPrice * 0.80;
                }
        }
        switch (review){
            case "positive":
                totalPrice = totalPrice * 1.25;
                break;
            case "negative":
                totalPrice = totalPrice * 0.90;
        }
        System.out.printf("%.2f", totalPrice);

    }
}

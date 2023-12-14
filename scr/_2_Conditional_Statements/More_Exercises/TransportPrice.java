package scr._2_Conditional_Statements.More_Exercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String travelingTime = scanner.nextLine();
        double finalPrice = 0;
        if (kilometers < 20){
            if (travelingTime.equals("day")){
                finalPrice = kilometers * 0.79  + 0.70;
            } else if (travelingTime.equals("night")) {
                finalPrice = kilometers * 0.90 + 0.70;
            }
        } else if (kilometers < 100) {
            double busPrice = kilometers * 0.09;
            if (travelingTime.equals("day")){
                double taxiPrice = kilometers * 0.79  + 0.70;
                finalPrice = Math.min(busPrice, taxiPrice);
            } else if (travelingTime.equals("night")) {
                double taxiPrice = kilometers * 0.90 + 0.70;
                finalPrice = Math.min(busPrice,taxiPrice);
            }
        } else {
            double trainPrice = kilometers * 0.06;
            if (travelingTime.equals("day")) {
                double taxiPrice = kilometers * 0.79 + 0.70;
                finalPrice = Math.min(trainPrice, taxiPrice);
            } else if (travelingTime.equals("night")) {
                double taxiPrice = kilometers * 0.90 + 0.70;
                finalPrice = Math.min(trainPrice, taxiPrice);
            }
        }
        System.out.printf("%.2f", finalPrice);
    }
}

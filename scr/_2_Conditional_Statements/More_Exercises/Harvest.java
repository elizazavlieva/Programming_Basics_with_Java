package scr._2_Conditional_Statements.More_Exercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter = Double.parseDouble(scanner.nextLine());
        int litresNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = vineyardArea * grapesPerMeter;
        double vine = (totalGrapes / 2.5) * 0.40;
        double diff = Math.abs(vine - litresNeeded);

        if (vine >= litresNeeded){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.", Math.floor(vine),
                    Math.ceil(diff), Math.ceil(diff /workers) );
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }


    }
}

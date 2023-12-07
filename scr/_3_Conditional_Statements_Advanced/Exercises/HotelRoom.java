package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int period = Integer.parseInt(scanner.nextLine());

        double studioCost = 0.00;
        double apartmentCost = 0.00;

        switch (month){
            case "May":
            case "October":
                studioCost = period * 50;
                apartmentCost = period * 65;
                if (period > 7 && period <= 14 ){
                    studioCost = studioCost * 0.95;
                } else if (period > 14) {
                    studioCost = studioCost * 0.70;
                }
                break;
            case "June":
            case "September":
                studioCost = period * 75.20;
                apartmentCost = period * 68.70;
                if (period > 14){
                    studioCost = studioCost * 0.80;
                }
                break;
            case "July":
            case "August":
                studioCost = period * 76;
                apartmentCost = period * 77;
                break;
        }
        if (period > 14){
            apartmentCost = apartmentCost * 0.90;
        }
        System.out.printf("Apartment: %.2f lv.", apartmentCost);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", studioCost);
    }
}

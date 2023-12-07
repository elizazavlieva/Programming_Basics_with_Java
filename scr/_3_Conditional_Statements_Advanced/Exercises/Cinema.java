package scr._3_Conditional_Statements_Advanced.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  projectionType = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double total = 0;
        double price = 0;

        switch (projectionType){
            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
        }
        total = (columns * row) * price;
        System.out.printf("%.2f leva", total);
    }
}

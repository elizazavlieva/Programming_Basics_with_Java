package scr._5_WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spending = 0;

        while (true){
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            days ++;
            switch (command){
                case "save":
                    budget += amount;
                    spending = 0;
                    break;
                case "spend":
                    if (budget <= amount){
                        budget = 0;
                    } else {
                        budget -= amount;
                    }
                    spending++;
                    break;
            }
            if (budget >= vacationPrice){
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
            if (spending == 5){
                System.out.printf("You can't save the money.%n%d",days);
                break;
            }
        }
    }
}

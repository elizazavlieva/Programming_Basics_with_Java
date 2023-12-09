package scr._5_WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalIncome = 0;

        String command = scanner.nextLine();
        while (!command.equals("NoMoreMoney")){
            double money = Double.parseDouble(command);
            if (money <= 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", money);
                totalIncome += money;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalIncome);
    }
}

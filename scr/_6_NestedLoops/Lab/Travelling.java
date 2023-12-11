package scr._6_NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            while (true){
                double income = Double.parseDouble(scanner.nextLine());
                budget -= income;
                if (budget <= 0){
                    System.out.printf("Going to %s!%n", command);
                    break;
                }
            }
            command = scanner.nextLine();
        }
    }
}

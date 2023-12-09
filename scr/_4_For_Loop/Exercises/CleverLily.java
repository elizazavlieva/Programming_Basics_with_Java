package scr._4_For_Loop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int savedMoney = 0;
        int currentMoney = 0;
        int toyQuantity = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0){
                currentMoney += 10;
                savedMoney += currentMoney;
            } else {
                toyQuantity++;
            }
        }
        int totalSavings = (toyQuantity * toyPrice) + (savedMoney - (age - toyQuantity));
        if (totalSavings >= washingMachinePrice){
            System.out.printf("Yes! %.2f", Math.abs(totalSavings - washingMachinePrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(totalSavings - washingMachinePrice));
        }

    }
}

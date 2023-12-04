package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine()) / 100;
        double result = deposit + time * ((deposit *interestRate) / 12);
        System.out.println(result);
    }
}

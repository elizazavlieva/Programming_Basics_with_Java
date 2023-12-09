package scr._5_WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int summary = 0;

        while (summary < number){
            int command = Integer.parseInt(scanner.nextLine());
            summary += command;
        }
        System.out.println(summary);
    }
}
package scr._5_WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cuurentMaxNum = Integer.MIN_VALUE;

        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            int number = Integer.parseInt(command);
            if (number > cuurentMaxNum){
                cuurentMaxNum = number;
            }
            command = scanner.nextLine();
        }
        System.out.println(cuurentMaxNum);
    }
}

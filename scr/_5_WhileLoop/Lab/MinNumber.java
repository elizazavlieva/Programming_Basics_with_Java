package scr._5_WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int cuurentMixNum = Integer.MAX_VALUE;

            String command = scanner.nextLine();
            while (!command.equals("Stop")){
                int number = Integer.parseInt(command);
                if (number < cuurentMixNum){
                    cuurentMixNum = number;
                }
                command = scanner.nextLine();
            }
            System.out.println(cuurentMixNum);
        }
    }
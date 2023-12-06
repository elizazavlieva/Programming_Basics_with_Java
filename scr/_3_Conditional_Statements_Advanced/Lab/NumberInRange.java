package scr._3_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = true;
        if (number >= -100){
            if (number <= 100){
                if (number == 0){
                    isValid = false;
                }
                }else {
                isValid = false;
            }
            }else {
            isValid = false;
        }
        if (isValid) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        }
    }


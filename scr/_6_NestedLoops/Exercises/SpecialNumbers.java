package scr._6_NestedLoops.Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1111 ; i <= 9999 ; i++) {
           String  number = "" + i;
            int counter = 0;
            for (int j = 0; j < number.length(); j++) {
                int currentNum = Integer.parseInt("" + number.charAt(j));
                if (currentNum == 0){
                break;
                } else if (num % currentNum == 0){
                        counter++;
                }
            }
            if (counter == 4){
                System.out.print(number + " ");
            }
        }
    }
}

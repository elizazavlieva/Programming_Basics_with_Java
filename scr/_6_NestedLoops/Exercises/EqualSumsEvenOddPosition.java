package scr._6_NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String number = String.valueOf(i);
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < number.length(); j++) {
                int singleNum = Integer.parseInt("" + number.charAt(j));
                if (j % 2 == 0) {
                    evenSum += singleNum;
                } else {
                    oddSum += singleNum;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}

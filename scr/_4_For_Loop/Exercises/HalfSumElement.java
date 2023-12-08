package scr._4_For_Loop.Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            result += number;

            if (maxNumber < number){
                maxNumber = number;
            }
        }
        result = result - maxNumber;
        if (result == maxNumber){
            System.out.printf("Yes\nSum = %d", result);
        }else {
            System.out.printf("No\nDiff = %d", Math.abs(maxNumber - result));
        }
    }
}

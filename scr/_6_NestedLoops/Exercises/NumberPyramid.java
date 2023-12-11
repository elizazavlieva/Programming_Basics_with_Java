package scr._6_NestedLoops.Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        boolean isBigger = false;
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (counter > n){
                    isBigger = true;
                    break;
                }
                System.out.printf("%d ", counter);
                counter++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}

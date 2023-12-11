package scr._6_NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int startNum = Integer.parseInt(scanner.nextLine());
         int endNum = Integer.parseInt(scanner.nextLine());
         int magicNum = Integer.parseInt(scanner.nextLine());
         int counter = 0;
         int firstNum = 0;
         int secondNum = 0;
         boolean isFound = false;

        for (int i = startNum; i <= endNum ; i++) {
            for (int j = startNum; j <= endNum ; j++) {
                counter++;
                if (i + j == magicNum){
                    firstNum = i;
                    secondNum = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
        }
        if (isFound){
            System.out.printf("Combination N:%d (%d + %d = %d)",
                    counter, firstNum, secondNum, magicNum);
        } else {
            System.out.printf("%d combinations - neither equals %d",
                    counter, magicNum);
        }
    }
}

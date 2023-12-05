package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesSum = minutes + 15;
        int hourSum = 0;
        if (minutesSum > 59){
           minutes = Math.abs(60 - minutesSum);
           hourSum = hour + 1;
           if (hourSum > 23){
               int diff = 24 - hourSum;
               if (diff == 0){
                   hour = 0;
               }else {
                   hour = 24 - diff;
               }
           }else {
               hour = hourSum;
           }
        }else {
            minutes = minutesSum;
        }if (minutes < 10){
            System.out.printf("%d:0%d", hour, minutes);
        }else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}

package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSecond = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secForOneMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = distance * secForOneMeter;
        double delay = Math.floor(distance / 15);
        totalTime = totalTime + (delay * 12.5);
        if (totalTime >= recordInSecond){
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSecond);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}

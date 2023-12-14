package scr._2_Conditional_Statements.More_Exercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - daysOff;
        int playTime = (workingDays * 63) + (daysOff * 127);
        int diff = Math.abs(playTime - 30000);
        int hours = diff / 60;
        int minutes = diff % 60;

        if (playTime > 30000){
            System.out.printf("Tom will run away%n" +
                    "%d hours and %d minutes more for play", hours, minutes);
        } else {
            System.out.printf("Tom sleeps well%n" +
                    "%d hours and %d minutes less for play", hours, minutes);
        }
    }
}

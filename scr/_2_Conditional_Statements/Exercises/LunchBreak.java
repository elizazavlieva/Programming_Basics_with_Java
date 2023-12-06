package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakDuration * ((double)1 / 8);
        double relaxTime = breakDuration * ((double) 1 / 4);
        double timeLeft = breakDuration - lunchTime - relaxTime;
        int diff = (int) Math.ceil(Math.abs(timeLeft - episodeDuration));
        if (episodeDuration <= timeLeft) {
            System.out.printf("You have enough time to watch %s and " +
                    "left with %d minutes free time.", seriesName, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s," +
                    " you need %d more minutes.", seriesName, diff);
        }
    }
}

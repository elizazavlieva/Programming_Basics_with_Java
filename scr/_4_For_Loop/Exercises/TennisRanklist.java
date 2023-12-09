package scr._4_For_Loop.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalPoints = Integer.parseInt(scanner.nextLine());
        int winCounter = 0;
        int points = 0;

        for (int i = 1; i <= n ; i++) {
            String tourmentStage = scanner.nextLine();
            switch (tourmentStage){
                case "W":
                    points += 2000;
                    winCounter += 1;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        totalPoints += points;
        int averagePoints =  points / n;
        double winPrs = ((double) winCounter / n) * 100;
        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %d\n", averagePoints);
        System.out.printf("%.2f%%\n", winPrs);
    }
}

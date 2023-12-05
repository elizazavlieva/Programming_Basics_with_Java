package scr._2_Conditional_Statements.Exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (points <= 100){
            bonusPoints = 5;

        } else if (points <= 1000) {
            bonusPoints = points * 0.20;
        }else {
            bonusPoints = points * 0.10;
        }if (points % 2 == 0){
            bonusPoints += 1;
        } else if (points % 10 == 5) {
            bonusPoints += 2;
        }
        double totalPoints = points + bonusPoints;
        System.out.printf("%.1f",bonusPoints);
        System.out.println();
        System.out.printf("%.1f",totalPoints);
    }
}

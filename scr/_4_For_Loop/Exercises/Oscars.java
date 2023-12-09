package scr._4_For_Loop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String actorName = scanner.nextLine();
        double actorPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        boolean isWinner = false;

        for (int i = 1; i <= n ; i++) {
            String juryName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            actorPoints += (juryName.length() * points) / 2;
            if (actorPoints >= 1250.50){
                isWinner = true;
                break;
            }
        }
        if (isWinner){
            System.out.printf("Congratulations, %s " +
                    "got a nominee for leading role with %.1f!",
                    actorName, actorPoints);
        } else {
            double diff = Math.abs(actorPoints - 1250.5);
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}

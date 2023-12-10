package scr._5_WhileLoop.Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int steps = 0;
        int totalSteps = 0;
        boolean goalReached = false;

        while (true){
            String command = scanner.nextLine();
            if (command.equals("Going home")){
                steps = Integer.parseInt(scanner.nextLine());
                totalSteps += steps;
                if (totalSteps >= goal){
                    goalReached = true;
                }
                break;
            }
            steps = Integer.parseInt(command);
            totalSteps += steps;
            if (totalSteps >=goal){
                goalReached = true;
                break;
            }
        }
        int diff = Math.abs(totalSteps - goal);
        if (goalReached){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}

package scr._5_WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBadMarks = Integer.parseInt(scanner.nextLine());
        int badMarkCounter = 0;
        int counter = 0;
        String lastProblem = "";
        int totalScore = 0;
        boolean isTired = false;


        while (true){
            String command = scanner.nextLine();
            if (command.equals("Enough")){
                break;
            }
            int mark = Integer.parseInt(scanner.nextLine());
            lastProblem = command;
            counter ++;
            totalScore += mark;
            if (mark <= 4){
                badMarkCounter++;
            }

            if (badMarkCounter == numBadMarks){
                isTired = true;
                break;
            }
        }
        if (isTired){
            System.out.printf("You need a break, %d poor grades.", badMarkCounter);
        } else {
            System.out.printf("Average score: %.2f%n", (double)totalScore/counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}

package scr._6_NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0;
        int counter = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")){
            double assignmentGrades = 0;
            for (int i = 1; i <= jury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalGrades += grade;
                assignmentGrades += grade;
                counter++;
            }
            double averageGrade = assignmentGrades / jury;
            System.out.printf("%s - %.2f.%n", command, averageGrade);
            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",
                totalGrades / counter);
    }
}

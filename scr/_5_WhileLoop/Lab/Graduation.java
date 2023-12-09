package scr._5_WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int classes = 0;
        double totalGrades = 0;


        while (classes < 12){
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;
            classes ++;
            if (grade < 4.0){
                break;
            }
        }
        double averageGrade = totalGrades / classes;
        if (classes == 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, classes);
        }
    }
}

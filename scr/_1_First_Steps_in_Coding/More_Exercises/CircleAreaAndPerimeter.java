package scr._1_First_Steps_in_Coding.More_Exercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculated_area = Math.PI * r * r;
        double calculated_parameter = 2 * Math.PI * r;

        System.out.printf("%.2f%n", calculated_area);
        System.out.printf("%.2f", calculated_parameter);
    }
}

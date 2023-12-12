package scr._1_First_Steps_in_Coding.More_Exercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double house = (x * x) + (x * x) + (x * y) + (x * y) - (1.2 * 2) - (1.5 * 1.5)-(1.5 * 1.5);
        double roof = ((x * h)/2) + ((x * h)/2) + (x * y) + (x * y);

        double green_paint = house / 3.4;
        double red_paint = roof / 4.3;

        System.out.printf("%.2f%n", green_paint);
        System.out.printf("%.2f", red_paint);
    }
}

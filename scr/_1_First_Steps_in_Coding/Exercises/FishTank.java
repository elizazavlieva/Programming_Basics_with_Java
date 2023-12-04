package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double volume = (double) (length * width * height) / 1000;
        double total = volume * (1 - percent);
        System.out.println(total);

    }
}

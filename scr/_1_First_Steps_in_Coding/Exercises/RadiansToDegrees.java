package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;


public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double result = radians * 180 / Math.PI;
        System.out.println(result);
    }
}

package scr._1_First_Steps_in_Coding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centimeters = Double.parseDouble(scanner.nextLine());
        double inches = 2.54;
        double result = centimeters * inches;
        System.out.println(result);
    }
}

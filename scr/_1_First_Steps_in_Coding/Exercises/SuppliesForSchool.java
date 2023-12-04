package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penQnty = Integer.parseInt(scanner.nextLine());
        int markersQnty = Integer.parseInt(scanner.nextLine());
        int cleaningDetergentQnty = Integer.parseInt(scanner.nextLine());
        double discountPrsnt = Double.parseDouble(scanner.nextLine()) / 100;
        double subtotal = penQnty * 5.80 + markersQnty * 7.20 + cleaningDetergentQnty * 1.20;
        double result = subtotal - (subtotal * discountPrsnt);
        System.out.println(result);
    }
}

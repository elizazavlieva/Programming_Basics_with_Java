package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu =  Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMeni = Integer.parseInt(scanner.nextLine());
        double subtotal = (chickenMenu * 10.35) + (fishMenu * 12.40) + (vegetarianMeni * 8.15);
        double desert = subtotal * 0.20;
        double total = subtotal + desert + 2.50;
        System.out.println(total);
    }
}

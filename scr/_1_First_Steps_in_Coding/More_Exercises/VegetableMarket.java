package scr._1_First_Steps_in_Coding.More_Exercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetables = Integer.parseInt(scanner.nextLine());
        int fruits = Integer.parseInt(scanner.nextLine());

        double totalPrice = (vegetablesPrice * vegetables) + (fruitsPrice * fruits);
        System.out.printf("%.2f", totalPrice / 1.94);

    }
}

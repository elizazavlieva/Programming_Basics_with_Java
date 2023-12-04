package scr._1_First_Steps_in_Coding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quadrature = Double.parseDouble(scanner.nextLine());
        double quadraturePrice = 7.61;
        double discountPrsnt = 0.18;
        double result = quadrature * quadraturePrice;
        double discount = result * discountPrsnt;
        double finalPrice =  result * discount;
        System.out.printf("The final price is: %f lv.\nThe discount is: %f lv.",
                finalPrice, discount);

    }
}

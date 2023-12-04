package scr._1_First_Steps_in_Coding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodQnty = Integer.parseInt(scanner.nextLine());
        int catFoodQnty = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice =  2.50;
        double catFoodPrice = 4.0;
        double result = (dogFoodPrice * dogFoodQnty) + (catFoodPrice * catFoodQnty);
        System.out.printf(result +" lv.");

    }
}

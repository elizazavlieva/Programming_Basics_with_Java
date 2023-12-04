package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basketballFee = Integer.parseInt(scanner.nextLine());
        double shoesPrice = basketballFee - (basketballFee * 0.40);
        double outfitPrice = shoesPrice - (shoesPrice * 0.20);
        double ballPrice = outfitPrice * ((double) 1 / 4);
        double accessoriesPrice = ballPrice * ((double) 1 / 5);
        double total = basketballFee + shoesPrice + outfitPrice + ballPrice + accessoriesPrice;
        System.out.println(total);

    }
}

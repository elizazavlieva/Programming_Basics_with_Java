package scr._3_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (product.equals("coffee")) {
            if (city.equals("Sofia")) {
                result = 0.50 * quantity;
            } else if (city.equals("Plovdiv")) {
                result = 0.40 * quantity;
            } else if (city.equals("Varna")) {
                result = 0.45 * quantity;
            }
        } else if (product.equals("water")) {
            if (city.equals("Sofia")) {
                result = 0.80 * quantity;
            } else {
                result = 0.70 * quantity;
            }
        } else if (product.equals("beer")) {
            if (city.equals("Sofia")) {
                result = 1.20 * quantity;
            } else if (city.equals("Plovdiv")) {
                result = 1.15 * quantity;
            } else if (city.equals("Varna")) {
                result = 1.10 * quantity;
            }
        } else if (product.equals("sweets")) {
            if (city.equals("Sofia")) {
                result = 1.45 * quantity;
            } else if (city.equals("Plovdiv")) {
                result = 1.30 * quantity;
            } else if (city.equals("Varna")) {
                result = 1.35 * quantity;
            }
        } else if (product.equals("peanuts")) {
            if (city.equals("Sofia")) {
                result = 1.60 * quantity;
            } else if (city.equals("Plovdiv")) {
                result = 1.50 * quantity;
            } else if (city.equals("Varna")) {
                result = 1.55 * quantity;
            }
        }
        System.out.println(result);
    }
    }
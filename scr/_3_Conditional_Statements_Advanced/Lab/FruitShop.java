package scr._3_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        boolean isValid = true;
        double result;

        if (day.equals("Monday") || day.equals("Tuesday")
                    || day.equals("Wednesday") || day.equals("Thursday")
                    || day.equals("Friday")) {
                switch (fruit){
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                    default:
                        isValid = false;
                        break;
                }
            } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit){
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                default:
                    isValid = false;
                    break;
        }
    } else {
            isValid = false;
        }
        if (isValid){
            result = quantity * price;
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }
    }
}

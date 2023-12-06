package scr._3_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissionPercent = 0;
        boolean isValid = true;

        switch (city) {
            case "Sofia" -> {
                if (sales >= 0 && sales <= 500) {
                    commissionPercent = 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercent = 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commissionPercent = 0.08;
                } else if (sales > 10000) {
                    commissionPercent = 0.12;
                } else {
                    isValid = false;
                }
            }
            case "Varna" -> {
                if (sales >= 0 && sales <= 500) {
                    commissionPercent = 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercent = 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commissionPercent = 0.10;
                } else if (sales > 10000) {
                    commissionPercent = 0.13;
                } else {
                    isValid = false;
                }
            }
            case "Plovdiv" -> {
                if (sales >= 0 && sales <= 500) {
                    commissionPercent = 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercent = 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commissionPercent = 0.12;
                } else if (sales > 10000) {
                    commissionPercent = 0.145;
                } else {
                    isValid = false;
                }
            }
            default -> isValid = false;
        }
        if (isValid){
           double result = sales * commissionPercent;
            System.out.printf("%.2f", result);
        }else {
            System.out.println("error");
        }
    }
    }

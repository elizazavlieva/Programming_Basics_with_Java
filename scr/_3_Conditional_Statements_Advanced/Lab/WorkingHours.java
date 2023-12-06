package scr._3_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        boolean isOpen = false;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10){
                    if (hour <= 18){
                        isOpen = true;
                    }
                }
                break;
        }
        if (isOpen){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }

    }
}

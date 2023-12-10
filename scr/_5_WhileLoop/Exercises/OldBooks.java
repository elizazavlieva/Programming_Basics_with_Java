package scr._5_WhileLoop.Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        int counter = 0;
        boolean isFound = false;

        String command = scanner.nextLine();
        while (!command.equals("No More Books")){
            if (command.equals(searchedBook)){
                isFound = true;
                break;
            }
            counter++;
            command = scanner.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}

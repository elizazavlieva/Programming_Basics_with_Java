package scr._5_WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals(password)){
            command = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}

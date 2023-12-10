package scr._5_WhileLoop.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakePieces = width * length;
        int pieces = 0;

        String command = scanner.nextLine();
        while (!command.equals("STOP")){
            pieces = Integer.parseInt(command);
            cakePieces -= pieces;
            if (cakePieces <= 0){
                break;
            }
            command = scanner.nextLine();
        }
        if (cakePieces >= 0){
            System.out.printf("%d pieces are left.", cakePieces);
        } else {
            System.out.printf("No more cake left! " +
                    "You need %d pieces more.", Math.abs(cakePieces));
        }
    }
}

package scr._5_WhileLoop.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalCubicMeters = width * length * height;
        boolean isEnough = true;

        String command = scanner.nextLine();
        while (!command.equals("Done")){
            int boxes = Integer.parseInt(command);
            totalCubicMeters -= boxes;
            if (totalCubicMeters <= 0){
                isEnough = false;
                break;
            }
            command = scanner.nextLine();
        }
        if (isEnough){
            System.out.printf("%d Cubic meters left.", totalCubicMeters);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalCubicMeters));
        }
    }
}

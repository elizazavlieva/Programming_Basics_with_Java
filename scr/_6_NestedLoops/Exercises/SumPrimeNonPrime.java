package scr._6_NestedLoops.Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumSum = 0;
        int nonPrimeSum = 0;


        String command = scanner.nextLine();
        while (!command.equals("stop")){
            int number = Integer.parseInt(command);
            if (number < 0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            int counter = 0;
            //Getting the dividers a number can have
            for (int i = 1; i <= number ; i++) {
                if (number % i == 0){
                    counter++;
                }
            }
            if (counter <= 2){
                primeNumSum += number;
            } else {
                nonPrimeSum += number;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}

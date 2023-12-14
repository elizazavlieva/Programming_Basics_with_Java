package scr._2_Conditional_Statements.More_Exercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolCapacity = Integer.parseInt(scanner.nextLine());
        int pipeOne = Integer.parseInt(scanner.nextLine());
        int pipeTwo = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

       double p1Litres = pipeOne * hours;
       double p2Litres = pipeTwo * hours;
       double totalLitres = p1Litres + p2Litres;
       double p1 = (p1Litres / totalLitres) * 100;
       double p2 = (p2Litres / totalLitres) * 100;
       double totalPrs = (totalLitres / poolCapacity) * 100;

       if (poolCapacity >= totalLitres){
           System.out.printf("The pool is %.2f%% full. " +
                   "Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPrs, p1, p2);
       } else {
           System.out.printf("For %.2f hours the pool overflows with %.2f liters.",
                   hours, totalLitres - poolCapacity);
       }
    }
}

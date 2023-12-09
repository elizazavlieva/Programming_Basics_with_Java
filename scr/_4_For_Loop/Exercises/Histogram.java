package scr._4_For_Loop.Exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numBelow200 = 0;
        int numBelow399 = 0;
        int numBelow599 = 0;
        int numBelow799 = 0;
        int numOver800 = 0;

        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                numBelow200++;
            } else if (number <= 399) {
                numBelow399++;
            } else if (number <= 599) {
                numBelow599++;

            } else if (number <= 799){
                numBelow799++;
            } else {
                numOver800++;
            }
        }
        double p1 = ((double) numBelow200 / n) * 100;
        double p2 = ((double)  numBelow399 / n) * 100;
        double p3 = ((double)  numBelow599 / n) * 100;
        double p4 = ((double)  numBelow799 / n) * 100;
        double p5 = ((double)  numOver800 / n) * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);

    }
}

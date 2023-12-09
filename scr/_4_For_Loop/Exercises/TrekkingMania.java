package scr._4_For_Loop.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int musalaCount = 0;
        int monblanCount = 0;
        int kilimajaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;
        int totalPeople = 0;

        for (int i = 1; i <= n ; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            if (groupSize <= 5){
                musalaCount += groupSize;
            } else if (groupSize <= 12) {
                monblanCount += groupSize;
            } else if (groupSize <= 25) {
                kilimajaroCount += groupSize;
            } else if (groupSize <= 40) {
                k2Count += groupSize;
            } else {
                everestCount += groupSize;
            }
            totalPeople += groupSize;
        }
        double musalaPrs =  ((double)musalaCount / totalPeople) * 100;
        double monblanPrs =  ((double)monblanCount / totalPeople) * 100;
        double kilimanjaroPrs = ((double)kilimajaroCount / totalPeople) * 100;
        double k2Prs = ((double)k2Count / totalPeople) * 100;
        double everestPrs = ((double)everestCount / totalPeople) * 100;

        System.out.printf("%.2f%%%n", musalaPrs);
        System.out.printf("%.2f%%%n", monblanPrs);
        System.out.printf("%.2f%%%n", kilimanjaroPrs);
        System.out.printf("%.2f%%%n", k2Prs);
        System.out.printf("%.2f%%%n", everestPrs);
    }
}

package scr._1_First_Steps_in_Coding.Exercises;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double Result = usd * 1.79549;
        System.out.println(Result);
    }
}

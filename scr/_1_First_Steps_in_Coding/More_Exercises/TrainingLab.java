package scr._1_First_Steps_in_Coding.More_Exercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h= Double.parseDouble(scanner.nextLine()) * 100;
        double w= Double.parseDouble(scanner.nextLine()) * 100;

        double width= Math.floor((w-100)/70);
        double height=Math.floor(h/120);

         double desks= (width*height)-3;
        System.out.println(desks);
    }
}

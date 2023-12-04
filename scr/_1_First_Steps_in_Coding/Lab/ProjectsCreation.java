package scr._1_First_Steps_in_Coding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int result = projectsCount * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                architectName, result, projectsCount);
    }
}

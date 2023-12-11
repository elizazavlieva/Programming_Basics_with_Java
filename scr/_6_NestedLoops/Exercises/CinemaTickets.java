package scr._6_NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentTickets = 0;
        int standardTickets = 0;
        int kindsTickets = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")){
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            int takenSeats = 0;
            int seats = availableSeats;
            while (!ticket.equals("End")){
                switch (ticket){
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kindsTickets++;
                        break;
                }

                ++takenSeats;
                --seats;
                if (seats <= 0){
                    break;
                }
                 ticket = scanner.nextLine();

                }
            double takenSeatsPrs = ((double) takenSeats / availableSeats)* 100;
            System.out.printf("%s - %.2f%% full.%n",
                    command, takenSeatsPrs );
            command = scanner.nextLine();
        }
        int totalTickets = kindsTickets + studentTickets + standardTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", ((double)studentTickets / totalTickets)* 100);
        System.out.printf("%.2f%% standard tickets.%n", ((double)standardTickets / totalTickets)* 100);
        System.out.printf("%.2f%% kids tickets.", ((double)kindsTickets / totalTickets)* 100);
    }
}

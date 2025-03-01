import java.util.Scanner;

public class AirlineReservation {
    private static boolean[] seats = new boolean[10]; // False means seat is available

    public static String assignSeat(int choice) {
        if (choice == 1) { // First class
            for (int i = 0; i < 5; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    return "First Class Seat " + (i + 1);
                }
            }
            return "No first class seats available.";
        } else { // Economy
            for (int i = 5; i < 10; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    return "Economy Seat " + (i + 1);
                }
            }
            return "No economy seats available.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int choice = scanner.nextInt();
            String result = assignSeat(choice);
            if (result.contains("No")) {
                System.out.println(result);
                System.out.println("Next flight leaves in 3 hours.");
                break;
            } else {
                System.out.println(result);
            }
        }
        scanner.close();
    }
}   
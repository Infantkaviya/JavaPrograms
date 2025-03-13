import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a day index (0-6): ");
            int index = scanner.nextInt();

            System.out.println("Day: " + weekdays[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input! Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

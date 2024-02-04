import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args)
    {
        // Creating the array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the day position (0-6): ");
            int dayPosition = scanner.nextInt();

            // Print the corresponding day name
            if (dayPosition >= 0 && dayPosition < weekdays.length)
            {
                System.out.println("Day name: " + weekdays[dayPosition]);
            } else {
                System.out.println("Invalid day position. Please enter a position between 0 and 6.");
            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

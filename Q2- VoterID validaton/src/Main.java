import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input: Reading voter details from the user
            System.out.print("Enter Voter ID: ");
            String voterId = scanner.next();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            // Creating a object (voter) with exception handling for age
            Voter voter = new Voter(voterId, name, age);

            // Output: Printing voter details
            System.out.println("Voter details: Voter ID -> " + voter.getVoterId() +
                    ", Name -> " + voter.getName() +
                    ", Age -> " + voter.getAge());

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
            scanner.close();
    }
}

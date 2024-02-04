import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        // Pushing elements onto the stack based on user input
        while (true) {
            System.out.print("Enter an integer to push onto the stack (or -1 to stop): ");
            int input = scanner.nextInt();

            if (input == -1 ) {
                break;
            }

            stack.push(input);
        }

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Popping elements from the stack until it's empty
        while (!stack.isEmpty()) {
            stack.pop();
        }

        // Attempting to pop from an empty stack
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Cannot pop from an empty stack.");
        }

        // Close the scanner
        scanner.close();
    }
}
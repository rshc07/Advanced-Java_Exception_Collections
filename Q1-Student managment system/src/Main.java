import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter student details:");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();

            scanner.nextLine();  //newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            scanner.nextLine();  //newline character
            System.out.print("Course: ");
            String course = scanner.nextLine();

            // Creating a object (student) with user input
            Student student = new Student(rollNo, name, age, course);

            // Displaying student details
            System.out.println("Student details: Roll No - " + student.getRollNo() +
                    ", Name - " + student.getName() +
                    ", Age - " + student.getAge() +
                    ", Course - " + student.getCourse());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

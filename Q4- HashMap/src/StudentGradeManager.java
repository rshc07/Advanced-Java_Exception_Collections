import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeManager
{
    private Map<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGradeManager()
    {
        this.studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println(name + "'s grade added successfully.");
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + "'s grade removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student not found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeManager gradeManager = new StudentGradeManager();

        gradeManager.addStudent("hemz", 85);
        gradeManager.addStudent("Scoby", 92);

        System.out.print("Enter a student name to display the grade: ");
        String studentName = scanner.nextLine();
        gradeManager.displayStudentGrade(studentName);

        System.out.print("Enter a student name to remove: ");
        String studentToRemove = scanner.nextLine();
        gradeManager.removeStudent(studentToRemove);

        System.out.print("Enter a new student name to add: ");
        String newStudentName = scanner.nextLine();
        System.out.print("Enter the grade for the new student: ");
        int newStudentGrade = scanner.nextInt();
        gradeManager.addStudent(newStudentName, newStudentGrade);

        scanner.close();
    }
}

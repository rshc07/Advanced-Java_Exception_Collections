// Student class with attributes and parameterized constructor
public class Student {
    int rollNo;
    String name;
    int age;
    String course;

    //To initialize values Parameterized constructor are initialized
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }

        // Check if the name contains numbers or special symbols
        if (!name.matches("^[a-zA-Z\\s]+$")) {
            throw new NameNotValidException("Name contains invalid characters");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getter methods

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
// Custom exception for age not within range
class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    NameNotValidException(String message) {
        super(message);
    }
}
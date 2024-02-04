public class Voter {
    String voterId;
    String name;
    int age;

    // Parameterized constructor with exception handling for age
    public Voter(String voterId, String name, int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getter methods

    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
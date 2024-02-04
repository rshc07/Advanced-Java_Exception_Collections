import java.util.EmptyStackException;

class Stack {
    private static final int MAX_SIZE = 100;
    private int[] array;
    private int top;

    // Constructor to initialize the stack
    public Stack() {
        array = new int[MAX_SIZE];
        top = -1;
    }

    // Function to push an element onto the stack
    public void push(int element) {
        if (top < MAX_SIZE - 1) {
            array[++top] = element;
            System.out.println("Element " + element + " pushed onto the stack.");
        } else {
            System.out.println("Stack overflow. Cannot push more elements.");
        }
    }

    // Function to pop an element from the stack
    public int pop() {
        if (!isEmpty()) {
            int poppedElement = array[top--];
            System.out.println("Element " + poppedElement + " popped from the stack.");
            return poppedElement;
        } else {
            throw new EmptyStackException();
        }
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
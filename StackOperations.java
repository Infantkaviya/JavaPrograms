import java.util.Stack;
import java.util.Scanner;

public class StackOperations {
    private Stack<Integer> stack;

    public StackOperations() {
        stack = new Stack<>();
    }

    public void pushElement(int value) {
        stack.push(value);
        System.out.println(value + " pushed onto the stack.");
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            System.out.println("Popped element: " + poppedValue);
        } else {
            System.out.println("Stack is empty! Nothing to pop.");
        }
    }

    public void isStackEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    public static void main(String[] args) {
        StackOperations stackOps = new StackOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push Element\n2. Pop Element\n3. Check if Stack is Empty\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stackOps.pushElement(value);
                    break;

                case 2:
                    stackOps.popElement();
                    break;

                case 3:
                    stackOps.isStackEmpty();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

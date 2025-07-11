import java.util.Scanner;

public class StackArray {
    static int top = -1;
    static int size = 5;
    static int[] stack = new int[size];

    public static void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}


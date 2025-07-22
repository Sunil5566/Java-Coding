import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    static class Task {
        String description;
        boolean isCompleted;

        Task(String description) {
            this.description = description;
            this.isCompleted = false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    tasks.add(new Task(desc));
                    System.out.println("Task added.");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter task number to remove: ");
                        int remIndex = scanner.nextInt();
                        scanner.nextLine();
                        if (remIndex > 0 && remIndex <= tasks.size()) {
                            tasks.remove(remIndex - 1);
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to mark completed.");
                    } else {
                        System.out.print("Enter task number to mark as completed: ");
                        int compIndex = scanner.nextInt();
                        scanner.nextLine();
                        if (compIndex > 0 && compIndex <= tasks.size()) {
                            tasks.get(compIndex - 1).isCompleted = true;
                            System.out.println("Task marked as completed.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("\n--- Tasks ---");
                        for (int i = 0; i < tasks.size(); i++) {
                            Task t = tasks.get(i);
                            String status = t.isCompleted ? "[Completed]" : "[Pending]";
                            System.out.printf("%d. %s %s%n", i + 1, t.description, status);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}

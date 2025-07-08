import java.io.*;
import java.util.*;

public class ToDoListManager {

    static ArrayList<String> tasks = new ArrayList<>();
    static final String FILE_NAME = "tasks.txt";

    public static void main(String[] args) {
        loadTasksFromFile();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== TO-DO LIST MANAGER ====");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    viewTasks();
                    break;
                case 2:
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    tasks.add("[ ] " + task);
                    saveTasksToFile();
                    break;
                case 3:
                    viewTasks();
                    System.out.print("Enter task number to mark as done: ");
                    int doneIndex = sc.nextInt();
                    markTaskAsDone(doneIndex - 1);
                    break;
                case 4:
                    viewTasks();
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = sc.nextInt();
                    deleteTask(deleteIndex - 1);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void viewTasks() {
        System.out.println("\n--- Your Tasks ---");
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    static void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            String task = tasks.get(index);
            if (!task.startsWith("[X]")) {
                tasks.set(index, task.replace("[ ]", "[X]"));
                saveTasksToFile();
                System.out.println("Task marked as done.");
            } else {
                System.out.println("Task already marked done.");
            }
        } else {
            System.out.println("Invalid task number.");
        }
    }

    static void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            saveTasksToFile();
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    static void loadTasksFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            // File might not exist yet, so ignore
        }
    }

    static void saveTasksToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                bw.write(task);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }
}

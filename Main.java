import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Task name: ");
                    String name = scanner.nextLine();

                    System.out.print("Priority (1=High, 2=Medium, 3=Low): ");
                    int priority;

                    try {
                        priority = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Priority must be a number.");
                        scanner.nextLine();
                        break;
                    }

                    manager.addTask(name, priority);
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("Enter task index to mark done: ");
                    int index;

                    try {
                        index = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Index must be a number.");
                        scanner.nextLine();
                        break;
                    }

                    manager.markTaskDone(index);
                    break;

                case 4:
                    System.out.println("Goodbye.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}        

       

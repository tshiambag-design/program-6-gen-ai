import java.util.Scanner;
// Main program with a simple menu
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

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Priority (1=High, 2=Medium, 3=Low): ");
                    int priority = scanner.nextInt();
                    manager.addTask(name, priority);
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("Enter task index to mark done: ");
                    int index = scanner.nextInt();
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

       

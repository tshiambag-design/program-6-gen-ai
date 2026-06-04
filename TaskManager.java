import java.util.ArrayList;
// Manages a list of tasks
class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String name, int priority) {
        tasks.add(new Task(name, priority));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }

    public void markTaskDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task index.");
        }
    }
}
 

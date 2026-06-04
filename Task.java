import java.util.ArrayList;
import java.util.Scanner;

// Represents a single task
class Task {
    private String name;
    private int priority; // 1 = High, 2 = Medium, 3 = Low
    private boolean completed;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String toString() {
        return "[Name: " + name +
               ", Priority: " + priority +
               ", Completed: " + completed + "]";
    }
}

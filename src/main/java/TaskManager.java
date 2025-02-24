import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    public List<Task> listTasks() {
        return new ArrayList<>(tasks);
    }

    public void deleteTask(String task) {
        // leave for iteration 4
        tasks.removeIf(task -> task.getDescription().equals(description));
    }

    public void exit() {
        // leave for iteration 2
        System.out.println("Tasks Saved...");
        System.out.println("Exiting...");
        System.exit(0);
    }
}
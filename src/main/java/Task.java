public class Task {
//    leave empty this is for iteration 3
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void markAsCompleted() {
        this.isCompleted = true;
    }
    @Override
    public String toString() {
        return description + "(Completed: " + isCompleted + ")";
    }
}

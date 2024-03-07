import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }


    // Method to mark the tasks as done
    public void markAsDone(){
        this.isDone = true;
    }

    // Method to mark the tasks as undone
    public void markAsUndone(){
        this.isDone = false;
    }

    public abstract String toSaveFormat();
    @Override
    public String toString() {
        return getStatusIcon() + " " + description; // Return status icon and description
    }
}

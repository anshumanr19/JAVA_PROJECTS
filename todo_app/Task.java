package spark_batch.basic_projects.todo_app;

public class Task {
    private String taskName;
    private int priority;
    private boolean isCompleted;

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean getCompletionStatus() {
        return this.isCompleted;
    }

    public void setCompletionStatus(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}


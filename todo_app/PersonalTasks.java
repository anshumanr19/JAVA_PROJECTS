package spark_batch.basic_projects.todo_app;

public class PersonalTasks extends Task{
    private String dueDate;

    public PersonalTasks(String name, int priority, String dueDate) {
        super(name, priority);
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

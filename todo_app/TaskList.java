package spark_batch.basic_projects.todo_app;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void editTask(String name, int priority) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(name)) {
                task.setPriority(priority);
                break;
            }
        }
    }

    public void deleteTask(String name) {
        tasks.removeIf(task -> task.getTaskName().equals(name));
    }

    public void markTaskAsCompleted(String name) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(name)) {
                task.setCompletionStatus(true);
                break;
            }
        }
    }

    public String displayTasks() {
        StringBuilder sb = new StringBuilder();
        sb.append("TaskList: \n");
        for (Task task : tasks) {
            sb.append("Task Type: ").append(task.getClass().getSimpleName())
                    .append(", Name: ").append(task.getTaskName())
                    .append(", Priority: ").append(task.getPriority())
                    .append(", Due date: ").append((task instanceof PersonalTasks ? ((PersonalTasks) task).getDueDate(): ((ProfesionalTasks) task).getDueDate()))
                    .append(", Completed: ")
                    .append(task.getCompletionStatus() ? "Yes" : "No")
                    .append("\n");
        }
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("TaskList: \n");
//        for (Task task : tasks) {
//            sb.append("Task Type: ").append(task.getClass().getSimpleName())
//                    .append(", Name: ").append(task.getTaskName())
//                    .append(", Priority: ").append(task.getPriority())
//                    .append(", Due date: ").append((task instanceof PersonalTasks ? ((PersonalTasks) task).getDueDate(): ((ProfesionalTasks) task).getDueDate()))
//                    .append(", Completed: ")
//                    .append(task.getCompletionStatus() ? "Yes" : "No")
//                    .append("\n");
//        }
//        return sb.toString();
//    }


}


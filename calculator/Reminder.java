package spark_batch.basic_projects.calculator;

import spark_batch.basic_projects.todo_app.Task;

import java.time.LocalDate;

public class Reminder {
    private Task task;
    private LocalDate reminderDate;

    public Reminder(Task task, LocalDate reminderDate) {
        this.task = task;
        this.reminderDate = reminderDate;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDate getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(LocalDate reminderDate) {
        this.reminderDate = reminderDate;
    }
}


package spark_batch.basic_projects.todo_app;

import java.util.Scanner;

public class ToDoListApp {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         TaskList taskList = new TaskList();

         System.out.print("Enter your username: ");
         String username = input.nextLine();
         System.out.print("Enter your password: ");
         String password = input.nextLine();

         User user = new User(username, password);

         if (user.getUsername().equals("admin") && user.getPassword().equals("password")) {
             System.out.println("Welcome to the To-Do List Application!");
             while (true) {
                 System.out.println("We offer the following operations:");
                 System.out.println("1. Add Task");
                 System.out.println("2. Edit Task");
                 System.out.println("3. Delete Task");
                 System.out.println("4. Mark Task as Completed");
                 System.out.println("5. Display Tasks");
                 System.out.println("6. Exit");

                 System.out.print("Please enter your choice: ");
                 int choice = input.nextInt();
                 input.nextLine(); // Consume newline

                 switch (choice) {
                     case 1:
                         System.out.println("Enter task name:");
                         String name = input.nextLine();
                         System.out.println("Enter Task type[personal/profesional]: ");
                         String taskType = input.nextLine();
                         System.out.println("Enter task priority:");
                         int priority = input.nextInt();
                         input.nextLine();
                         if (taskType.equalsIgnoreCase("personal")) {
                             System.out.println("Enter due date for your personal task: ");
                             String dueDate = input.nextLine();
                             taskList.addTask(new PersonalTasks(name, priority, dueDate));
                         } else if (taskType.equalsIgnoreCase("profesional")) {
                             System.out.println("Enter due date for your profesional task: ");
                             String dueDate = input.nextLine();
                             taskList.addTask(new ProfesionalTasks(name, priority, dueDate));
                         }
                         break;
                     case 2:
                         System.out.println("Enter task name to edit:");
                         name = input.nextLine();
                         System.out.println("Enter new priority:");
                         priority = input.nextInt();
                         taskList.editTask(name, priority);
                         break;
                     case 3:
                         System.out.println("Enter task name to delete:");
                         name = input.nextLine();
                         taskList.deleteTask(name);
                         break;
                     case 4:
                         System.out.println("Enter task name to mark as completed:");
                         name = input.nextLine();
                         taskList.markTaskAsCompleted(name);
                         break;
                     case 5:
                         System.out.println(taskList.displayTasks());
//                         System.out.println(taskList);
                         break;
                     case 6:
                         System.out.println("Exiting...");
                         return;
                     default:
                         System.out.println("Invalid choice. Please try again.");
                 }
             }
         } else System.out.println("Invalid credentials.\nPlease try again.");


     }
}




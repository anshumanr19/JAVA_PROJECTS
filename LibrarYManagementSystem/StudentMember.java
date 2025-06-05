package spark_batch.basic_projects.LibrarYManagementSystem;

public class StudentMember extends Member implements Borrowable {
    public StudentMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(getName() + " (Student) borrowed: " + book);
    }
}

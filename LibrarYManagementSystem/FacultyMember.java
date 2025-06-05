package spark_batch.basic_projects.LibrarYManagementSystem;

public class FacultyMember extends Member implements Borrowable {
    public FacultyMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(getName() + " (Faculty) borrowed: " + book);
    }
}


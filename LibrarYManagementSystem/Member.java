package spark_batch.basic_projects.LibrarYManagementSystem;

public class Member {
    private final String name;
    private final String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ")";
    }
}

//class StudentMember extends Member {
//    public StudentMember(String name, String memberId) {
//        super(name, memberId);
//    }
//
//    // Additional behavior specific to students
//}

//class FacultyMember extends Member {
//    public FacultyMember(String name, String memberId) {
//        super(name, memberId);
//    }
//
//    // Additional behavior specific to faculty
//}


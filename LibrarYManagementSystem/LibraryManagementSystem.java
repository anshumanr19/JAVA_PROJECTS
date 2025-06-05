package spark_batch.basic_projects.LibrarYManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static List<Book> books = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding sample books
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));

        // Adding sample members
        members.add(new StudentMember("Alice", "S001"));
        members.add(new FacultyMember("Bob", "F001"));

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. List Books");
            System.out.println("2. List Members");
            System.out.println("3. Borrow Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    listBooks();
                    break;
                case 2:
                    listMembers();
                    break;
                case 3:
                    borrowBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void listBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    private static void borrowBook(Scanner scanner) {
        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();
        Member member = findMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String bookTitle = scanner.nextLine();
        Book book = findBookByTitle(bookTitle);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member instanceof Borrowable) {
            ((Borrowable) member).borrowBook(book);
        } else {
            System.out.println("This member cannot borrow books.");
        }
    }

    private static Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private static Book findBookByTitle(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }
}



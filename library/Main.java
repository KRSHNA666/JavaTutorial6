package library;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create book and member
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Member member1 = new Member("Alice", "M001");

        // Create transaction handler
        Transaction transaction = new Transaction();

        // Borrow book
        transaction.borrowBook(book1, member1);
        member1.displayBorrowedBooks();

        System.out.println();

        // Return book
        transaction.returnBook(book1, member1);
        member1.displayBorrowedBooks();
    }
}

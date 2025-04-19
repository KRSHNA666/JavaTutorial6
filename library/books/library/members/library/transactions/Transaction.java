package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void borrowBook(Book book, Member member) {
        System.out.println(member.getName() + " is borrowing \"" + book.getTitle() + "\".");
        member.borrowBook(book);
    }

    public void returnBook(Book book, Member member) {
        System.out.println(member.getName() + " is returning \"" + book.getTitle() + "\".");
        member.returnBook(book);
    }
}

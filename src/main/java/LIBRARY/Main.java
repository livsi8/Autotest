package LIBRARY;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> filtredBook = Library.getBook("Medal", "name");
        for (Book book : filtredBook) {
            System.out.println(book.name);
        }
    }
}
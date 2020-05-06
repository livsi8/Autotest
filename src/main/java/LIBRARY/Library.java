package LIBRARY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    public static List<Book> bookList = Arrays.asList(
            new Book("Medal of Honor", "Pupkin", 1888, 2888, "Hard cover", 8000),
            new Book("Building auto", "Vaskin", 1999, 155, "Soft cover", 22),
            new Book("Building computer", "Tutochkin", 1679, 228, "Soft cover", 333),
            new Book("Сookbook", "Petrov", 2020, 4000, "Hard cover", 10500),
            new Book("Lolita", "Nabokov", 1980, 500, "Hard cover", 300)
    );

    public static List<Book> getBook(String textSearch, String name) {

        List<Book> bookSearch = new ArrayList<>();
        for (Book value : bookList) {
            if (value.name.contains(textSearch)) {
                bookSearch.add(value);
            }


        }
        return bookSearch;

    }
}


package LIBRARY;

public class Book {
    public String name;
    public String author;
    public int year;
    public int countPage;
    public String typeBinding;
    public double price;

    public Book(String name, String author, int year, int countPage, String typeBinding, double price) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.countPage = countPage;
        this.typeBinding = typeBinding;
        this.price = price;
    }
}






//Библиотека ===
//        Книга:
//        свойства:
//        - название
//        - автор
//        - издательство
//        - год издания
//        - количество страниц
//        - тип переплета
//        - цена
//        Библиотека:
//        свойства:
//        - список книг
//        услуги библиотеки:
//        - поиск по автору
//        - поиск по издательству
//        - поиск по году выпуска (выпуск после заданого года)
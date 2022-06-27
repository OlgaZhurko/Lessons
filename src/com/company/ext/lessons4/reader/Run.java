package com.company.ext.lessons4.reader;

public class Run {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Fedorov A.D.", 1, "FKT", "01.07.1999", 77777777);
        Reader reader2 = new Reader("Popov E.A.", 2, "FKT", "03.07.2000", 88888888);
        Reader reader3 = new Reader("Kabak R.V.", 3, "FKT", "05.07.2009", 99999999);
        Reader[] readers = {reader1,reader2,reader3};
        Book book1 = new Book("Над пропастью во ржи", " Джером Д. Сэлинджер");
        Book book2 = new Book("Унесённые ветром", " Маргарет Митчелл");
        Book book3 = new Book("Сто лет одиночества", " Габриэль Гарсия Маркес");
        Book[] books = {book1, book2, book3};

        reader1.takeBook(5);
        reader2.takeBook("Великий Гэтсби, Фрэнсис Скотт Фитцджеральд", "Война и мир, Лев Толстой");
        reader3.takeBook(book1.getName() + book1.getAuthor());

        reader1.returnBook(1);
        reader2.returnBook("Война и мир, Лев Толстой");
        reader3.returnBook(book3.getName() + book3.getAuthor());

        rBooks(books);
        rReader(readers);
    }

    private static void rReader(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader.toString());
        }
        System.out.println();
    }

    private static void rBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println();
    }
}

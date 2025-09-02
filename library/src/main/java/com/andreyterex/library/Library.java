package com.andreyterex.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

//    Написать программу аналог библиотеки, которая должна уметь делать:
//— добавить книгу
//— получить список всех книг
//— получить информацию о книге по id
//— удалить книгу
//    Имя проекта: library

    public static class Book {
        public final int id;
        public final String title;
        public final String author;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{id=" + id + ", " +
                    "title='" + title + "', " +
                    "author='" + author + "'}";
        }
    }

    private final Map<Integer, Book> lib = new HashMap<>();
    private int nextId = 1;

    public int addBook(String title, String author) {
        int id = nextId++;
        Book book = new Book(id, title, author);
        lib.put(id, book);
        return id;
    }

    public List<Book> findAll() {
        return new ArrayList<>(lib.values());
    }

    public Book findById(int id) {
        return lib.get(id);
    }

    public boolean delete(int id) {
        return lib.remove(id) != null;
    }

    public static void demo() {
        Library lib = new Library();

        int id1 = lib.addBook("Чистый код", "Роберт Мартин");
        int id2 = lib.addBook("Грокаем алгоритмы", "Адитья Бхаргава");
        int id3 = lib.addBook("Двадцать тысяч лье под водой", "Жюль Верн");
        int id4 = lib.addBook("Солярис", "Станислав Лем");

        System.out.println("Все книги, добавленные через метод addBook(String title, String author)");
        for (Book b : lib.findAll()) {
            System.out.println(b);
        }
        System.out.println("===============================");

        System.out.println("Метод findById(id)");
        System.out.println("id " + id2 + " Book = " + lib.findById(id2));

        System.out.println("===============================");

        System.out.println("Метод delete(id)");
        System.out.println("delete id " + id1 + " -> " + lib.delete(id1));

        System.out.println("===============================");

        System.out.println("Все книги, после применения методов");
        for (Book b : lib.findAll()) {
            System.out.println(b);
        }
    }
}
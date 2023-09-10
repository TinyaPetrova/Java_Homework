package lesson53;

import java.util.Arrays;

/**
 * Создайте класс Book (книга), в конструктор которого передавайте автора, название книги и
 * количество страниц. Реализуйте интерфейс для сравнения книг: они должны сортироваться по
 * авторам, а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном
 * порядке"), а если и авторы совпадают - по количеству страниц (по возрастанию).
 */
public class Task1 {

  public static void main(String[] args) {
    Book book1 = new Book("A", "3", 300);
    Book book2 = new Book("C", "1", 200);
    Book book3 = new Book("B", "2", 250);
    Book[] books = {book1, book2, book3};
    Arrays.sort(books);
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

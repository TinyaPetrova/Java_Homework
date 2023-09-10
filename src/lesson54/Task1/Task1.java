package lesson54.Task1;

import java.util.Arrays;

/**
 * Используйте класс Book (книга) из предыдущего домашнего задания.
 * Создайте компаратор, который позволит сортировать книги по названию, при одинаковых названиях -
 * по автору (и там, и там - по алфавиту).
 */
public class Task1 {

  public static void main(String[] args) {
    Book book1 = new Book("A", "3", 300);
    Book book2 = new Book("C", "1", 200);
    Book book3 = new Book("B", "2", 250);
    Book[] books = {book1, book2, book3};
    BookComparator bookComparator = new BookComparator();
    Arrays.sort(books, bookComparator);
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

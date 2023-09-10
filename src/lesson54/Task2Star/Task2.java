package lesson54.Task2Star;

import java.util.Arrays;

/**
 * Создайте компаратор, который позволит сортировать книги
 * по убыванию количества страниц, а при совпадающем объёме - по названиям
 * ("по возрастанию", по алфавиту).
 */
public class Task2 {

  public static void main(String[] args) {
    Book book1 = new Book("A", "3", 300);
    Book book2 = new Book("C", "1", 200);
    Book book3 = new Book("B", "2", 250);
    Book[] books = {book1, book2, book3};
    PagesComparator pagesComparator = new PagesComparator();
    Arrays.sort(books, pagesComparator);
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

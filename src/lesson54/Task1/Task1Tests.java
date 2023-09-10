package lesson54.Task1;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Напишите автотесты с использованием JUnit для задачи 1 из предыдущего домашнего задания.
 * Проверьте краевые случаи, предусмотрите разные варианты.
 */
public class Task1Tests {
  @Test
  public void testBookComparator() {
    Book book1 = new Book("A", "3", 300);
    Book book2 = new Book("C", "1", 200);
    Book book3 = new Book("B", "2", 250);
    Book[] books = {book1, book2, book3};
    BookComparator bookComparator = new BookComparator();
    sort(books, bookComparator);

    assertEquals("B", books[0].getAuthor());
    assertEquals("2", books[0].getTitle());
    assertEquals("C", books[1].getAuthor());
    assertEquals("1", books[1].getTitle());
    assertEquals("A", books[2].getAuthor());
    assertEquals("3", books[2].getTitle());
  }
}

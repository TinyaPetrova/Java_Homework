package lesson54.Task1;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
  @Override
  public int compare(Book book1, Book book2) {
    int titleComparison = book1.getTitle().compareTo(book2.getTitle());
    if (titleComparison != 0) {
      return titleComparison;
    }
    return book1.getAuthor().compareTo(book2.getAuthor());
  }
}

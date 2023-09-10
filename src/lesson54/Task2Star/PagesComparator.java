package lesson54.Task2Star;

import java.util.Comparator;

public class PagesComparator implements Comparator<Book> {
  @Override
  public int compare(Book book1, Book book2) {
    int pagesComparison = Integer.compare(book2.getPages(), book1.getPages());
    if (pagesComparison == 0) {
      return book1.getTitle().compareTo(book2.getTitle());
    }
    return pagesComparison;
  }
}

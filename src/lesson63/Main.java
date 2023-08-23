package lesson63;

import java.util.*;

/**
 * Задача:
 * Используйте класс Book из домашнего задания к уроку 53, но без интерфейса Comparable.
 * Создайте список книг и отсортируйте книги по автору, (при одинаковых авторах - по названиям)
 * при помощи анонимного класса в качестве компаратора.
 */
public class Main {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество книг: ");
    int numBooks = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < numBooks; i++) {
      System.out.println("Книга " + (i + 1));
      System.out.print("Введите автора: ");
      String author = scanner.nextLine();
      System.out.print("Введите название: ");
      String title = scanner.nextLine();
      System.out.print("Введите количество страниц: ");
      int pages = scanner.nextInt();
      scanner.nextLine();
      books.add(new Book(author, title, pages));
    }

    // анонимный компаратор bookComparator
    Comparator<Book> bookComparator = new Comparator<Book>() {
      @Override
      public int compare(Book book1, Book book2) {
        if (book1.getAuthor().compareTo(book2.getAuthor()) != 0) {
          return book1.getAuthor().compareTo(book2.getAuthor());
        }
        if (book1.getTitle().compareTo(book2.getTitle()) != 0) {
          return book1.getTitle().compareTo(book2.getTitle());
        }
        return Integer.compare(book1.getPages(), book2.getPages());
      }
    };
    Collections.sort(books, bookComparator);
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

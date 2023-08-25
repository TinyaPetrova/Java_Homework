package lesson64;

import java.util.*;

/**
 * Задача: Используйте класс Book из домашнего задания к уроку 53 (см. Book.java), но без интерфейса
 * Comparable. Создайте список книг. Отсортируйте книги по автору, (при одинаковых авторах - по
 * названиям) и выведите получившийся список с использованием потоков.
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
      System.out.print("Введите кол-во страниц: ");
      int pages = scanner.nextInt();
      scanner.nextLine();
    }

//    books.stream()
//               .sorted(Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle))
//               .forEach(System.out::println);
//  }

    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
          return authorComparison;
        }
        return book1.getTitle().compareTo(book2.getTitle());
      }
    });
  }
}
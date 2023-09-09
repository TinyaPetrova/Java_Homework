package lesson52;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  /**
   * Напишите программу создания небольшого словаря сленговых программерских выражений, чтобы она
   * потом по запросу возвращала значения из этого словаря.
   * <p>
   * Формат входных данных: Файл dict.txt В первой строке задано одно целое число n — количество
   * слов в словаре. В следующих n строках записаны слова и их определения, разделенные двоеточием и
   * символом пробела.
   * <p>
   * Ввод с клавиатуры: В первой строке записано целое число m — количество поисковых слов, чье
   * определение нужно вывести. В следующих m строках записаны сами слова, по одному на строке.
   * <p>
   * Формат выходных данных: Для каждого слова, независимо от регистра символов, если оно
   * присутствует в словаре, необходимо вывести на экран его определение. Если слова в словаре нет,
   * программа должна вывести "Не найдено", без кавычек.
   * <p>
   * Примечание 1 Мини-словарь для начинающих разработчиков можно посмотреть тут.
   * <p>
   * Примечание 2 Гарантируется, что в определяемом слове или фразе отсутствует двоеточие (:),
   * следом за которым идёт пробел.
   * <p>
   * Пример входных данных: 5 Змея: язык программирования Python Баг: от англ. bug — жучок, клоп,
   * ошибка в программе Конфа: конференция Костыль: код, который нужен, чтобы исправить
   * несовершенство ранее написанного кода Бета: бета-версия, приложение на стадии публичного
   * тестирования 3 Змея Жаба костыль
   * <p>
   * Пример выходных данных: язык программирования Python Не найдено код, который нужен, чтобы
   * исправить несовершенство ранее написанного кода
   */
  public static void writeDictionaryToFile(List<String> dictionary) {
    BufferedWriter writer = new BufferedWriter(new FileWriter("src/lesson52/dict.txt"))){
      for (String entry : dictionary) {
        writer.write(entry);
        writer.newLine();
        System.err.println("Ошибка при записи в файл: " + e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> dictionary = new ArrayList<>();
    System.out.print("Введите кол-во новых слов: ");
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < n; i++) {
      System.out.print("Введите слово: ");
      String newWord = scanner.nextLine();
      System.out.println("Введите определение: ");
      String newDef = scanner.nextLine();
      dictionary.add(newWord + newDef);
    }
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader("src/lesson52/dict.txt"));
    } catch (FileNotFoundException e) {
      System.err.println("Словарь не найден: " + e.getMessage());
      throw new RuntimeException(e);
    }
    try {
      String line;
      while ((line = reader.readLine()) != null) {
        dictionary.add(line);
      }
    } catch (IOException e) {
      System.err.println("Ошибка при чтении словаря: " + e.getMessage());
      throw new RuntimeException(e);
    }
    System.out.print("Введите кол-во слов: ");
    int m = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < m; i++) {
      System.out.print("Введите слово для поиска: ");
      String searchWord = scanner.nextLine().toLowerCase();
      boolean found = false;
      for (String entry : dictionary) {
        if (entry.toLowerCase().indexOf(searchWord + ":") == 0) {
          System.out.println(
              "\u001B[35m" + entry.substring(entry.indexOf(":") + 2) + "\u001B[0m");
          found = true;
          break;
        }
      }
      if (!found) {
        System.out.println("\u001B[31mНе найдено\u001B[0m");
      }
    }
  }
}

package lesson52;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  /**
   * Напишите программу создания небольшого словаря сленговых программерских выражений,
   * чтобы она потом по запросу возвращала значения из этого словаря.
   *
   * Формат входных данных:
   * Файл dict.txt
   * В первой строке задано одно целое число n — количество слов в словаре.
   * В следующих n строках записаны слова и их определения, разделенные двоеточием и символом пробела.
   *
   * Ввод с клавиатуры:
   * В первой строке записано целое число m — количество поисковых слов, чье определение нужно вывести.
   * В следующих m строках записаны сами слова, по одному на строке.
   *
   * Формат выходных данных:
   * Для каждого слова, независимо от регистра символов, если оно присутствует в словаре,
   * необходимо вывести на экран его определение.
   * Если слова в словаре нет, программа должна вывести "Не найдено", без кавычек.
   *
   * Примечание 1
   * Мини-словарь для начинающих разработчиков можно посмотреть тут.
   *
   * Примечание 2
   * Гарантируется, что в определяемом слове или фразе отсутствует двоеточие (:),
   * следом за которым идёт пробел.
   *
   * Пример входных данных:
   * 5
   * Змея: язык программирования Python
   * Баг: от англ. bug — жучок, клоп, ошибка в программе
   * Конфа: конференция
   * Костыль: код, который нужен, чтобы исправить несовершенство ранее написанного кода
   * Бета: бета-версия, приложение на стадии публичного тестирования
   * 3
   * Змея
   * Жаба
   * костыль
   *
   * Пример выходных данных:
   * язык программирования Python
   * Не найдено
   * код, который нужен, чтобы исправить несовершенство ранее написанного кода
   *
   * @param args аргументы командной строки
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> dictionary = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader("lesson52/dictionary.txt"));
    int num = Integer.parseInt(reader.readLine());
    for (int i = 0; i < num; i++) {
      String word = reader.readLine();
      dictionary.add(word);
    }
    System.out.print("Введите кол-во слов: ");
    int m = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Определения:");
    for (int i = 0; i < m; i++) {
      System.out.print("Введите слово для поиска: ");
      String searchWord = scanner.nextLine().toLowerCase();
      boolean found = false;
      for (String entry : dictionary) {
        if (entry.toLowerCase().indexOf(searchWord + ":") == 0) {
          System.out.println(entry.substring(entry.indexOf(":") + 2));
          found = true;
          break;
        }
      }
      if (!found) {
        System.out.println("Не найдено");
      }
    }
  }
}

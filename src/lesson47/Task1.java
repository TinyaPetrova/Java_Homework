package lesson47;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

  /**
   * На вход программе подаётся одна строка текста.
   * Необходимо посчитать частоту появления разных символов в строке и вывести результат.
   * Пример ввода:
   * Lorem ipsum dolor sit amet.
   * Пример вывода (порядок может быть другим):
   * l: 2
   * o: 3
   * r: 2
   * e: 2
   * m: 3
   *  : 4
   * i: 2
   * p: 1
   * s: 2
   * u: 1
   * d: 1
   * t: 2
   * a: 1
   * .: 1
   *
   * @param args аргументы командной строки
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку текста: ");
    String input = scanner.nextLine();
    Map<Character, Integer> charFrequency = new HashMap<>();

  }
}

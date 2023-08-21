package lesson61;

import java.util.Scanner;

/**
 * Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
 * Выводим все самые короткие слова через пробел. Оцениваем временную и пространственную сложность
 * алгоритма.
 */
public class Task2Star {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество слов -> ");
    int wordsAmount;
    do {
      try {
        wordsAmount = scanner.nextInt();
        break;
      } catch (Exception e) {
        System.out.print("Неправильный ввод. Попробуйте ввести КОЛИЧЕСТВО слов -> ");
        scanner.nextLine();
      }
    } while (true);
    scanner.nextLine();
    String[] words = new String[wordsAmount];
    int minLength = Integer.MAX_VALUE;
    boolean isLengthEqual = true;
    for (int i = 0; i < wordsAmount; i++) {
      if (scanner.hasNextLine()) {
        words[i] = scanner.nextLine();
        if (containsLetters(words[i])) {
          int wordLength = words[i].length();
          minLength = Math.min(minLength, words[i].length());
          if (wordLength != minLength) {
            isLengthEqual = false;
          }
        } else {
          System.out.println("Недопустимые символы, попробуйте ещё раз");
          scanner.nextLine();
          i--;
        }
      }
    }
    StringBuilder res = new StringBuilder();
    for (String word : words) {
      if (word.length() == minLength) {
        res.append(word).append(" ");
      }
    }
    System.out.println(res.toString());
    if (isLengthEqual) {
      System.out.println("Все слова одинаковой длины");
    }
  }

  public static boolean containsLetters(String word) {
    for (char c : word.toCharArray()) {
      if (!Character.isLetter(c)) {
        return false;
      }
    }
    return true;
  }
}

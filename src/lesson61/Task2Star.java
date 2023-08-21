package lesson61;

import java.util.Scanner;

/**
 * Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
 * Выводим все самые короткие слова через пробел. Оцениваем временную и пространственную сложность
 * алгоритма.
 */
public class Task2Star {

  public static void main(String[] args) {                   // Time: O(n)   Space: O(n)
    Scanner scanner = new Scanner(System.in);                // O(1)         O(1)
    System.out.print("Введите количество слов -> ");         // O(1)
    int wordsAmount;                                         // O(1)         O(1)
    do {                                                     // O(1)         O(1)
      try {                                                  // O(1)         O(1)
        wordsAmount = scanner.nextInt();                     // O(1)         O(1)
        break;                                               // O(1)         O(1)
      } catch (Exception e) {                                // O(1)         O(1)
        System.out.print("Неправильный ввод. "               // O(1)
            + "Попробуйте ввести КОЛИЧЕСТВО слов -> ");
        scanner.nextLine();                                  // O(1)         O(1)
      }
    } while (true);                                          // O(n)         O(1)
    scanner.nextLine();                                      // O(1)         O(1)
    String[] words = new String[wordsAmount];                // O(1)         O(1)
    int minLength = Integer.MAX_VALUE;                       // O(1)         O(1)
    boolean isLengthEqual = true;                            // O(1)         O(1)
    for (int i = 0; i < wordsAmount; i++) {                  // O(n)         O(1)
      if (scanner.hasNextLine()) {                           // O(1)         O(1)
        words[i] = scanner.nextLine();                       // O(1)         O(1)
        if (containsLetters(words[i])) {                     // O(1)         O(1)
          int wordLength = words[i].length();                // O(1)         O(1)
          minLength = Math.min(minLength, words[i].length());// O(1)         O(1)
          if (wordLength != minLength) {                     // O(1)         O(1)
            isLengthEqual = false;                           // O(1)         O(1)
          }
        } else {                                             // O(1)         O(1)
          System.out.println("Недопустимые символы, "        // O(1)
              + "попробуйте ещё раз");
          scanner.nextLine();                                // O(1)         O(1)
          i--;                                               // O(1)         O(1)
        }
      }
    }
    StringBuilder res = new StringBuilder();                 // O(1)         O(1)
    for (String word : words) {                              // O(n)         O(1)
      if (word.length() == minLength) {                      // O(1)         O(1)
        res.append(word).append(" ");                        // O(n)         O(n)
      }
    }
    System.out.println(res.toString());                      // O(1)         O(1)
    if (isLengthEqual) {                                     // O(1)         O(1)
      System.out.println("Все слова одинаковой длины");      // O(1)
    }
  }

  public static boolean containsLetters(String word) {
    for (char c : word.toCharArray()) {                      // O(n)         O(1)
      if (!Character.isLetter(c)) {                          // O(1)         O(1)
        return false;                                        // O(1)         O(1)
      }
    }
    return true;                                             // O(1)         O(1)
  }
}

package lesson61;

import java.util.Scanner;

/**
 * Находим минимальное чётное число в последовательности положительных чисел
 * или выводим -1, если такого числа не существует.
 * Оцениваем временную и пространственную сложность алгоритма.
 */
public class Task1 {                                   // Time: O(n)           Space: O(1)

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);          // 0(1)                 O(1)
    System.out.print("Количество чисел -> ");          // 0(1)                 O(1)
    int amount = scanner.nextInt();                    // 0(1)                 O(1)
    int minEvenNum = Integer.MAX_VALUE;                // 0(1)                 O(1)
    boolean isEvenFound = false;                       // 0(1)                 O(1)
    for (int i = 0; i < amount; i++) {                 // 0(n)                 O(1)
      System.out.print("Число " + (i + 1) + " -> ");   // 0(1)                 O(1)
      int num = scanner.nextInt();                     // 0(1)                 O(1)
      if (num > 0 && num % 2 == 0) {                   // 0(1)                 O(1)
        isEvenFound = true;                            // 0(1)                 O(1)
        minEvenNum = Math.min(minEvenNum, num);        // 0(1)                 O(1)
      }
    }
    if (isEvenFound) {                                 // 0(1)
      System.out.println(minEvenNum);                  // 0(1)
    } else {
      System.out.println(-1);                          // 0(1)
    }
  }

}

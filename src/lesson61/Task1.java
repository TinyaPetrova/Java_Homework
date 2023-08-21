package lesson61;

import java.util.Scanner;

/**
 * Находим минимальное чётное число в последовательности положительных чисел
 * или выводим -1, если такого числа не существует.
 * Оцениваем временную и пространственную сложность алгоритма.
 */
public class Task1 {                                 // Time:            Space:

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Количество чисел -> ");
    int amount = scanner.nextInt();
    int minEvenNum = Integer.MAX_VALUE;
    boolean isEvenFound = false;
    for (int i = 0; i < amount; i++) {
      System.out.print("Число " + (i + 1) + " -> ");
      int num = scanner.nextInt();
      if (num > 0 && num % 2 == 0) {
        isEvenFound = true;
        minEvenNum = Math.min(minEvenNum, num);
      }
    }
    if (isEvenFound) {
      System.out.println(minEvenNum);
    } else {
      System.out.println(-1);
    }
  }

}

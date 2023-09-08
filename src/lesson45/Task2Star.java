package lesson45;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Даны два списка целых чисел.
 * Посчитайте, сколько чисел содержится одновременно как в первом списке, так и во втором.
 * Для каждого списка программе на вход подаётся сначала количество чисел,
 * а затем и сами числа, каждое в новой строке.
 * Используйте множества.
 * Примечание: прочитайте про метод retainAll и используйте его.
 */
public class Task2Star {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for (int i = 0; i < n1 + n2; i++) {
      int num = scanner.nextInt();
      if (i < n1) {
        set1.add(num);
      } else {
        set2.add(num);
      }
    }
    set1.retainAll(set2);
    System.out.println("Кол-во общих чисел: " + set1.size());
  }
}

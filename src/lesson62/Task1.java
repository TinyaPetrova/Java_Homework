package lesson62;

import java.util.Scanner;

/**
 Task1 содержит рекурсивный метод public static String reverse(int x),
 который возвращает строку, содержащую десятичные цифры числа в обратном порядке
 (разворачивает число).
 **/
public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Число -> ");
    int num = scanner.nextInt();
    String reversedNum = reverse(num);
    System.out.print("Цифры числа в обратном порядке -> " + reversedNum);
  }

  public static String reverse(int x) {
    // если юзер вводит цифру, а не число, просто возвращаем её
    if (x <= 9) {
      return Integer.toString(x);
      // иначе вычисляем последнюю цифру путём деления с остатком
      // и продолжаем делать это, пока не останется цифра
    } else {
      int lastDigit = x % 10;
      return lastDigit + reverse(x / 10);
    }
  }
}

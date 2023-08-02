package lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Размер списка: ");
      int size = Integer.parseInt(scanner.nextLine());
      List<Integer> numbers = new ArrayList<>();
      for (int i = 0; i < size; ++i) {
        numbers.add(Integer.parseInt(scanner.nextLine()));
      }
      int count = 0;
      for (int i = 1; i < size - 1; ++i) {
        int curr = numbers.get(i);
        int prev = numbers.get(i - 1);
        int next = numbers.get(i + 1);
        if (curr > prev && curr > next) {
          count++;
        }
      }
      System.out.println("Элементы, которые больше двух своих соседей: " + count);
    } catch (NumberFormatException e) {
      System.out.println("Ошибка формата ввода чисел");
    }
  }
}

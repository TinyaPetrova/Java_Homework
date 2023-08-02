package lesson42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество чисел: ");
    int amount = scanner.nextInt();
    scanner.nextLine();
    List<Integer> numbers = new ArrayList<>();
    System.out.println("Введите " + amount + " чисел/числа:");
    for (int i = 0; i < amount; ++i) {
      numbers.add(scanner.nextInt());
    }
    printOddNumbers(numbers);
  }

  private static void printOddNumbers(List<Integer> numbers) {
    System.out.println("Нечётные числа: ");
    for (int number : numbers) {
      if (number % 2 != 0) {
        System.out.println(number);
      }
    }
  }
}


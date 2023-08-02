package lesson43;

import java.util.Scanner;

/*
Нужно внедрить введённое число в ряд чисел.
Ряд чисел: от большего к меньшему.
Программа получает на вход:
- Размер последовательности;
- Саму невозрастающую последовательность натуральных чисел.

После этого вводится число X.
Все числа во входных данных натуральные и не превышают 200.

Затем программа должна вывести номер числа Х в ряду.
Если в ряду есть одинаковые числа = Х, то Х ставится после них.
 */
public class Task3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] row = new int[size];
    for (int i = 0; i < size; i++) {
      row[i] = scanner.nextInt();
    }
    int x = scanner.nextInt();
    int position = 1;
    for (int i = 0; i < size; i++) {
      if (row[i] >= x) {
        position++;
      } else {
        break;
      }
    }
    System.out.println(position);
  }
}


package lesson51;

import java.util.Scanner;

/*
Усовершенствуйте класс Month из классной работы.
Добавьте для каждого месяца количество дней.
Спросите у пользователя номер месяца (нумерация начинается с 1, январь - первый месяц!)
и выведите по номеру название и количество дней.

Решение:
В классе Main заводим Scanner, через который запрашиваем у юзера № месяца.
Делаем проверку на корректность номера.
Получаем месяц по номеру.
Выводим название и количество дней.
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите номер месяца (от 1 до 12): ");
    int monthNumber = scanner.nextInt();
    if (monthNumber < 1 || monthNumber > 12) {
      System.out.println("Некорректный номер месяца!");
      return;
    }
    Month selectedMonth = Month.values()[monthNumber - 1];
    System.out.println("Выбранный месяц: " + selectedMonth.getName());
    System.out.println("Количество дней: " + selectedMonth.getDays());
  }
}


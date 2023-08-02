package lesson44.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Добавляем к чекам сквозную нумерацию:
- Делаем счётчик billCounter для генерации номеров чеков (int number).
- Делаем конструктор public Bill(), в котором мы присваиваем номер чека и увеличиваем счётчик.
- Дополняем вывод номера чека в методе toString().
 */

public class Bill {

  private static int billCounter = 1;
  private final int number;
  List<Row> rows = new ArrayList<>();

  public Bill() {
    this.number = billCounter++;
    this.rows = new ArrayList<>();
  }

  public void addInteractive(Scanner scanner) {
    System.out.print("Введите название позиции: ");
    String title = scanner.nextLine();

    System.out.print("Введите стоимость: ");
    while (!scanner.hasNextDouble()) {
      System.out.println("Некорректный ввод, введите число: " + scanner.nextLine());
    }
    double price = scanner.nextDouble();
    scanner.nextLine();

    rows.add(new Row(title, price));
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("Чек #" + number + ":\n");
    double total = 0.0;
    for (Row row : rows) {
      result.append(row).append("\n");
      total += row.getPrice();
    }
    result.append("Итого: ").append(String.format("%.2f", total));
    return result.toString();
  }
}

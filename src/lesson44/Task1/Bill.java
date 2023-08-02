package lesson44.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Добавляем в чек вывод итоговой суммы:
- В написанный на занятии класс Bill добавляем переменную double total;
- Эту переменную будем увеличивать с 0.0 на сумму каждой позиции.
- С помощью метода String.format() добавляем значение в итоговой строке.
 */

public class Bill {

  List<Row> rows = new ArrayList<>();
  private int number;

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
    StringBuilder result = new StringBuilder("Чек #" + getNumber() + ":\n");
    double total = 0.0;
    for (Row row : rows) {
      result.append(row).append("\n");
      total += row.getPrice();
    }
    result.append("Итого: ").append(String.format("%.2f", total));
    return result.toString();
  }

  public int getNumber() {
    return number;
  }
}

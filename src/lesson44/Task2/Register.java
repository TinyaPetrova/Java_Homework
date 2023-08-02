package lesson44.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Класс Register, в котором мы реализуем методы:
- addInteractive (чтобы добавить позицию);
- closeBill (чтобы закрыть чек).
*/

public class Register {

  private final List<Bill> bills = new ArrayList<>();
  private Bill current = new Bill();

  public void addInteractive(Scanner scanner) {
    current.addInteractive(scanner);
  }

  public void closeBill() {
    bills.add(current);
    System.out.println(current);
    current = new Bill();
  }
}

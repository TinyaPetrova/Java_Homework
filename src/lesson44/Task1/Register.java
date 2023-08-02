package lesson44.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lesson44.Task1.Bill;

public class Register {

  private Bill current = new Bill();
  private int billCounter;
  private final List<Bill> bills = new ArrayList<>();

  public Register() {
    this.billCounter = 1;
  }

  public void addInteractive(Scanner scanner) {
    current.addInteractive(scanner);
  }

  public void closeBill() {

    bills.add(current);
    System.out.println(current);
    current = new Bill();
  }
}

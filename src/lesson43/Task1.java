package lesson43;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int size = scanner.nextInt();
      scanner.nextLine();

      List<String> names = new ArrayList<>();
      for (int i = 0; i < size; ++i) {
        String name = scanner.nextLine();
        names.add(name);
      }

      int index = scanner.nextInt();
      String selectedName = names.get(index - 1);
      System.out.println(selectedName);

    } catch (InputMismatchException e) {
      System.out.println("Ошибка ввода: нужен номер имени");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Такого номера нет");
    }
  }
}

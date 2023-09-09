package lesson46;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2Star {

  /**
   * Создать словарь (Map<String, String>) занести в него записи по принципу "фамилия" - "имя".
   * Сначала количество записей, а потом фамилию и имя для каждой записи прочитать с клавиатуры.
   * Фамилия и имя будут расположены в одной строке через пробел, необходимо воспользоваться
   * методами строк (String): substring() и indexOf().
   * Удалить людей, имеющих одинаковые имена.
   * Вывести содержимое словаря (после удаления) на экран.
   *
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> dictionary = new HashMap<>();
    System.out.print("Введите количество записей: ");
    int count = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < count; i++) {
      System.out.print("Введите фамилию и имя через пробел: ");
      String input = scanner.nextLine();
      String[] parts = input.split(" ");
      if (parts.length == 2) {
        String lastName = parts[0];
        String firstName = parts[1];
        dictionary.put(lastName, firstName);
      } else {
        System.out.println("\u001B[31mНеправильный формат ввода, запись не добавлена!\u001B[0m");
      }
    }
  }
}

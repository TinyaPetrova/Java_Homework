package lesson46;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Создать словарь (Map<String, String>) занести в него записи по принципу "фамилия" - "имя".
 * Сначала количество записей, а потом фамилию и имя для каждой записи прочитать с клавиатуры.
 * Фамилия и имя будут расположены в одной строке через пробел, необходимо воспользоваться
 * методами строк (String): substring() и indexOf().
 * Удалить людей, имеющих одинаковые имена.
 * Вывести содержимое словаря (после удаления) на экран.
 */
public class Task2Star {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> dictionary = new HashMap<>();
    System.out.print("Введите количество записей: ");
    int count = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < count; i++) {
      System.out.print("Введите фамилию и имя через пробел: ");
      String input = scanner.nextLine();
      int spaceIndex = input.indexOf(' ');
      if (spaceIndex != -1) {
        String lastName = input.substring(0, spaceIndex);
        String firstName = input.substring(spaceIndex + 1);
        dictionary.put(lastName, firstName);
      } else {
        System.out.println("\u001B[31mНеправильный формат ввода, запись не добавлена!\u001B[0m");
      }
    }
    Set<String> uniqueNames = new HashSet<>();
    Iterator<Entry<String, String>> iterator = dictionary.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, String> entry = iterator.next();
      String firstName = entry.getValue();
      if (uniqueNames.contains(firstName)) {
        iterator.remove();
      } else {
        uniqueNames.add(firstName);
      }
    }
    System.out.println("\u001B[35mГотовый справочник:\u001B[0m");
    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}

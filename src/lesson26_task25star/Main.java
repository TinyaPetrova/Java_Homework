package lesson26_task25star;

/**
 * Проверка метода public int get(int index);
 */
public class Main {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println("Элемент по индексу 3: " + list.get(3));
  }
}

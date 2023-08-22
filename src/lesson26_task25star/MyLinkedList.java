package lesson26_task25star;

/**
 * На базе класса MyLinkedList реализовать метод:
 * public int get(int index);
 */
public class MyLinkedList {
  private Node first;
  private Node last;
  private int count;

  public MyLinkedList() {
    this.count = 0;
  }

  public void add(int element) {
    Node newNode = new Node(element);

    if (count == 0) {
      first = newNode;
    } else {
      last.next = newNode;
    }

    last = newNode;
    count++;
  }

  public void addFirst(int element) {
    Node newNode = new Node(element);

    if (first != null) {
      newNode.next = first;
    } else {
      last = newNode;
    }

    first = newNode;
    count++;
  }

  public int getCount() {
    return count;
  }

  public int get(int index) {
    if (index < 0 || index >= count) {
      throw new IndexOutOfBoundsException("Такого индекса нет");
    }

    Node currentNode = first;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }

    return currentNode.value;
  }
}

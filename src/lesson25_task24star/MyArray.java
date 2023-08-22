package lesson25_task24star;

/**
 * На базе класса MyArray реализовать методы:
 * boolean containsAll(MyArray list) - возвращает true, если все элементы списка list содержатся в текущем списке
 * void clear() - очищает список
 * void set(int index, int element) - заменяет элемент в списке под нужным индексом
 * void removeRange(int fromIndex, int toIndex) - удаляет все элементы в заданном диапазоне
 */
public class MyArray {
  private int count;
  private int[] array;

  public MyArray() {
    this.count = 0;
    this.array = new int[10];
  }

  public void add(int element) {
    if (count == array.length) {
      System.out.println("Массив переполнен");
      resize();
    }
    this.array[this.count] = element;
    this.count++;
  }

  private void resize() {
    int[] newArray = new int[array.length + array.length / 2];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
  }

  public int remove(int element) {
    for (int i = 0; i < count; i++) {
      if (array[i] == element) {
        for (int j = i; j < count - 1; j++) {
          array[j] = array[j + 1];
        }
        count--;
      }
    }
    return count;
  }

  public int removeLast() {
    count--;
    return count;
  }

  public int getCount() {
    return count;
  }

  public boolean containsAll(MyArray list) {
    for (int i = 0; i < list.getCount(); i++) {
      int element = list.get(i);
      boolean contains = false;
      for (int j = 0; j < count; j++) {
        if (array[j] == element) {
          contains = true;
          break;
        }
      }
      if (!contains) {
        return false;
      }
    }
    return true;
  }

  public void clear() {
    count = 0;
    array = new int[10];
  }

  public void set(int index, int element) {
    if (index >= 0 && index < count) {
      array[index] = element;
    } else {
      throw new IndexOutOfBoundsException("Такого индекса нет");
    }
  }

  public void removeRange(int fromIndex, int toIndex) {
    if (fromIndex >= 0 && toIndex < count && fromIndex <= toIndex) {
      int numberToRemove = toIndex - fromIndex + 1;
      for (int i = fromIndex; i < count - numberToRemove; i++) {
        array[i] = array[i + numberToRemove];
      }
      count -= numberToRemove;
    } else {
      throw new IndexOutOfBoundsException("Такого диапазона нет");
    }
  }

  public int get(int index) {
    if (index >= 0 && index < count) {
      return array[index];
    } else {
      throw new IndexOutOfBoundsException("Такого инекса нет");
    }
  }
}

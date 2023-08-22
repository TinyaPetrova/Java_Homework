package lesson25_task24star;

public class Main {
  public static void main(String[] args) {
    MyArray array = new MyArray();

    // добавление элементов
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(5);
    array.add(55);
    array.add(555);
    array.add(5555);

    System.out.println("Кол-во элементов в массиве: " + array.getCount());

    // удаление эл-тов
    System.out.println("Удален элемент = 1. Теперь элементов в списке: " + array.remove(1));
    System.out.println("Удален элемент = 3. Теперь элементов в списке: " + array.remove(3));
    System.out.println("Удален последний элемент: " + array.removeLast());

    // все ли элементы списка list содержатся в текущем списке
    MyArray listToCheck = new MyArray();
    listToCheck.add(2);
    listToCheck.add(5);
    System.out.println("Все элементы из списка есть: " + array.containsAll(listToCheck));

    // изменение элемента по индексу
    array.set(0, 10);
    System.out.println("Элемент 1 изменен на 10: " + array.get(0));

    // удаление элементов в заданном диапазоне
    array.removeRange(1, 3);
    System.out.println("Элементы в диапазоне [1, 3] удалены. Теперь элементов в списке: " + array.getCount());

    // очистка массива
    array.clear();
    System.out.println("Массив очищен. Теперь элементов в списке: " + array.getCount());
  }
}


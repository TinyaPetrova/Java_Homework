package lesson51;

/*
Усовершенствуйте класс Month из классной работы.
Добавьте для каждого месяца количество дней.
Спросите у пользователя номер месяца (нумерация начинается с 1, январь - первый месяц!)
и выведите по номеру название и количество дней.

Решение:
В public enum Month добавляем поле days.
Задаём соответствующие значения.
 */
public enum Month {

  JANUARY("Январь", 31),
  FEBRUARY("Февраль", 28),
  MARCH("Март", 31),
  APRIL("Апрель", 30),
  MAY("Май", 31),
  JUNE("Июнь", 30),
  JULY("Июль", 31),
  AUGUST("Август", 31),
  SEPTEMBER("Сентябрь", 30),
  OCTOBER("Октябрь", 31),
  NOVEMBER("Ноябрь", 30),
  DECEMBER("Декабрь", 31);

  private final String name;
  private final int days;

  Month(String name, int days) {
    this.name = name;
    this.days = days;
  }

  public String getName() {
    return name;
  }

  public int getDays() {
    return days;
  }
}


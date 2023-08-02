package lesson44.Task2;

public class Row {

/*
Класс Row, в котором мы реалищуем метод toString
*/

  private final String title;
  private final double price;

  public Row(String title, double price) {
    this.title = title;
    this.price = price;
  }

  @Override
  public String toString() {
    //return title + " =" + price;
    return  String.format("%s = %.2f", title, price);
  }

  public double getPrice() {
    return price;
  }
}

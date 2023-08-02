package lesson50;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Усовершенствуйте задачу 1 так, чтобы путь к входному
и выходному файлу она принимала в качестве аргументов
командной строки
 */
public class Task2 {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Переходим в консоль");
      return;
    }
    String inputFilePath = args[0];
    String outputFilePath = args[1];
    File inputFile = new File(inputFilePath);
    File outputFile = new File(outputFilePath);
    int number;
    try {
      Scanner scanner = new Scanner(inputFile);
      number = scanner.nextInt();
      scanner.close();
    } catch (FileNotFoundException e) {
      System.err.println("Файл не найден: " + e.getMessage());
      return;
    }
    String binaryString = Integer.toBinaryString(number);
    try {
      FileWriter writer = new FileWriter(outputFile);
      writer.write(binaryString);
      writer.close();
    } catch (IOException e) {
      System.err.println("Ошибка при записи в файл: " + e.getMessage());
      return;
    }
    System.out.println("Двоичное представление записано в файл '" + outputFilePath + "'");
  }
}

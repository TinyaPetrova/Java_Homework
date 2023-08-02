package lesson50;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Напишите программу, которая:

прочитает целое число из файла res/in.txt
переведёт его в двоичную запись
запишет его в файл res/out.txt
Воспользуйтесь методом Integer.toBinaryString().
 */
public class Task1 {
  public static void main(String[] args) {
    File inputFile = new File("Excercises/res/in.txt");
    File outputFile = new File("Excercises/res/out.txt");
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
    System.out.println("Двоичное представление числа " + number + " записано в файл 'out.txt'");
  }
}


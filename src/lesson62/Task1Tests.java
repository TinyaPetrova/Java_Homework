package lesson62;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Task1Tests {

  @Test
  public void testReverseCommon() {
    // arrange
    int source = 123;

    //act
    String res = Task1.reverse(source);

    //assert
    assertEquals("321", res);
  }

  @Test
  public void testReverseZero() {
    int source = 0;
    String res = Task1.reverse(source);
    assertEquals("321", res);
  }
}

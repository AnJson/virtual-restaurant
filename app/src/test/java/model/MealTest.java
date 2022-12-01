package model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MealTest {
  @Test
  public void constructorShouldThrowWhenFirstArgumentIsNull() {
    int price = 225;
    assertThrows(NullPointerException.class, () -> new Meal(null, price));
  }

  @Test
  public void constructorShouldThrowWhenFirstArgumentIsBlankString() {
    int price = 225;
    assertThrows(IllegalArgumentException.class, () -> new Meal(" ", price));
  }

  @Test
  public void constructorShouldThrowWhenFirstArgumentIsLessThanThreeCharacters() {
    int price = 225;
    assertThrows(IllegalArgumentException.class, () -> new Meal("As", price));
  }

  @Test
  public void setNameShouldThrowWhenArgumentIsNull() {
    int price = 225;
    String name = null;
    Meal sut = new Meal("Lasagna", price);
    assertThrows(NullPointerException.class, () -> sut.setName(name));
  }

  @Test
  public void setNameShouldThrowWhenArgumentIsBlankString() {
    int price = 225;
    String name = " ";
    Meal sut = new Meal("Lasagna", price);
    assertThrows(IllegalArgumentException.class, () -> sut.setName(name));
  }

  @Test
  public void setNameShouldThrowWhenArgumentIsLessThanThreeCharacters() {
    int price = 225;
    String name = "As";
    Meal sut = new Meal("Lasagna", price);
    assertThrows(IllegalArgumentException.class, () -> sut.setName(name));
  }
}

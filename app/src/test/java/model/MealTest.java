package model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MealTest {
  @Test
  public void constructorShouldThrowWhenFirstArgumentIsNull() {
    int price = 225;
    String name = null;
    assertThrows(NullPointerException.class, () -> new Meal(name, price));
  }

  @ParameterizedTest
  @ValueSource(strings = { " ", "   ", "\t", "\n" })
  public void constructorShouldThrowWhenFirstArgumentIsBlankString(String name) {
    int price = 225;
    assertIllegalConstructorArgument(name, price);
  }

  @Test
  public void constructorShouldThrowWhenFirstArgumentIsLessThanThreeCharacters() {
    int price = 225;
    String name = "As";
    assertIllegalConstructorArgument(name, price);
  }

  @Test
  public void setNameShouldThrowWhenArgumentIsNull() {
    String name = null;
    int price = 225;
    Meal sut = new Meal("Lasagna", price);
    assertThrows(NullPointerException.class, () -> sut.setName(name));

  }

  @ParameterizedTest
  @ValueSource(strings = { " ", "   ", "\t", "\n" })
  public void setNameShouldThrowWhenArgumentIsBlankString(String name) {
    assertIllegalSetNameArgument(name);
  }

  @Test
  public void setNameShouldThrowWhenArgumentIsLessThanThreeCharacters() {
    String name = "As";
    assertIllegalSetNameArgument(name);
  }

  private void assertIllegalConstructorArgument(String name, int price) {
    assertThrows(IllegalArgumentException.class, () -> new Meal(name, price));
  }

  private void assertIllegalSetNameArgument(String name) {
    int price = 225;
    Meal sut = new Meal("Lasagna", price);
    assertThrows(IllegalArgumentException.class, () -> sut.setName(name));
  }
}

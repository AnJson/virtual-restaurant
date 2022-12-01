package model;

public class Meal {
  private String name;

  public Meal (String name, int price) {
    validateName(name);
    this.name = name;
  }

  private void validateName(String name) {
    if (name == null) {
      throw new NullPointerException("Name-argument should not be null.");
    }

    if (name.trim() == "") {
      throw new IllegalArgumentException("Name-argument should not be an empty string.");
    }
  }
}

package model;

public class Meal {
  private String name;

  public Meal (String name, int price) {
    setName(name);
  }

  public void setName(String name) {
    validateName(name);
    this.name = name;
  }

  private void validateName(String name) {
    if (name == null) {
      throw new NullPointerException("Name-argument should not be null.");
    }

    if (name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name-argument should not be an empty string.");
    }

    if (name.trim().length() < 3) {
      throw new IllegalArgumentException("Name-argument should not be less than three characters.");
    }
  }
}

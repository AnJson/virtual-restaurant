package model;

public class Meal {
  private String name;

  public Meal (String name, int price) {
    if (name == null) {
      throw new NullPointerException("Name-argument should not be null.");
    }

    this.name = name;
  }
}

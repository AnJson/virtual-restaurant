package model;

public class Meal {
  public Meal (String name, int price) {
    if (name == null) {
      throw new NullPointerException("Name-argument should not be null.");
    }
  }
}

package models;

public class Student {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public String toString() {
    return name;
  }

  public boolean equals(Object obj) {
    Student other = (Student) obj;
    return name.equals(other.name);
  }
}

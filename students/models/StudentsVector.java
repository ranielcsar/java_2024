package models;

public class StudentsVector {
  private Object[] objects;
  private int listSize = 0;

  public StudentsVector(int vectorSize) {
    objects = new Object[vectorSize];
  }

  public void add(Student student) {
    handleListSpace();

    objects[listSize] = student;
    listSize++;
  }

  private boolean occupiedPosition(int position) {
    if (position < objects.length && position >= 0) {
      return true;
    }

    return false;
  }

  private void handleListSpace() {
    if (listSize == objects.length) {
      Object[] newList = new Object[objects.length * 2];

      for (int i = 0; i < objects.length; i++) {
        newList[i] = objects[i];
      }

      objects = newList;
    }
  }

  public void addAt(int index, Student student) {
    handleListSpace();

    if (!occupiedPosition(index)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    for (int i = listSize - 1; i >= index; i--) {
      objects[i + 1] = objects[i];
    }

    objects[index] = student;
    listSize++;
  }

  public Object get(int index) {
    if (!occupiedPosition(index)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    return objects[index];
  }

  public void remove(int index) {
    if (!occupiedPosition(index)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    for (int i = index; i < listSize - 1; i++) {
      objects[i] = objects[i + 1];
    }

    listSize--;
  }

  public boolean contain(Student student) {
    for (int i = 0; i < listSize; i++) {
      if (student == objects[i]) {
        return true;
      }
    }

    return false;
  }

  public int size() {
    return listSize;
  }

  public String toString() {
    if (listSize == 0) {
      return "[]";
    }

    StringBuilder builder = new StringBuilder();
    builder.append("[");

    for (int i = 0; i < listSize - 1; i++) {
      builder.append(objects[i]);
      builder.append(", ");
    }

    builder.append(objects[listSize - 1]);
    builder.append("]");

    return builder.toString();
  }
}
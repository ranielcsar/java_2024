package models;

public class StudentsVector {
  private Student[] students;
  private int listSize = 0;

  public StudentsVector(int vectorSize) {
    students = new Student[vectorSize];
  }

  public void add(Student student) {
    students[listSize] = student;
    listSize++;
  }

  private boolean occupiedPosition(int position) {
    if (position < students.length && position >= 0) {
      return true;
    }

    return false;
  }

  public void addAt(int index, Student student) {
    if (!occupiedPosition(index)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    for (int i = listSize - 1; i >= index; i--) {
      students[i + 1] = students[i];
    }

    students[index] = student;
    listSize++;
  }

  public Student get(int index) {
    if (!occupiedPosition(index)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    return students[index];
  }

  public void remove(int index) {
    if (!occupiedPosition(index)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    for (int i = index; i < listSize - 1; i++) {
      students[i] = students[i + 1];
    }

    listSize--;
  }

  public boolean contain(Student student) {
    for (int i = 0; i < listSize; i++) {
      if (student == students[i]) {
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
      builder.append(students[i]);
      builder.append(", ");
    }

    builder.append(students[listSize - 1]);
    builder.append("]");

    return builder.toString();
  }
}
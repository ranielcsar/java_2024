package tests;

import models.Student;
import models.StudentsVector;

public class RemoveByIndexTest {
  public static void main(String[] args) {
    Student joao = new Student();
    Student jose = new Student();

    joao.setName("João");
    jose.setName("José");

    StudentsVector studentList = new StudentsVector(5);
    studentList.add(joao);
    studentList.add(jose);

    studentList.remove(0);

    System.out.println("Removendo estudante específico: ");
    System.out.println(studentList);
  }
}

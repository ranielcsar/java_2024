package tests;

import models.Student;
import models.StudentsVector;

public class ContainStudentTest {
  public static void main(String[] args) {
    Student joao = new Student();
    Student jose = new Student();

    joao.setName("João");
    jose.setName("José");

    StudentsVector studentList = new StudentsVector(5);
    studentList.add(joao);
    studentList.add(jose);

    System.out.println("Contém João?: " + studentList.contain(joao));
    System.out.println("Contém José?: " + studentList.contain(jose));
  }
}

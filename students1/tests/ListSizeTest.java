package tests;

import models.Student;
import models.StudentsVector;

public class ListSizeTest {
  public static void main(String[] args) {
    Student joao = new Student();
    Student jose = new Student();
    Student maria = new Student();

    joao.setName("João");
    jose.setName("José");
    maria.setName("Maria");

    StudentsVector studentList = new StudentsVector(5);
    studentList.add(joao);
    studentList.add(jose);

    System.out.println("Tamanho da lista ao adicionar João e José: " + studentList.size());

    studentList.add(maria);
    System.out.println("Tamanho da lista ao adicionar Maria: " + studentList.size());
  }
}

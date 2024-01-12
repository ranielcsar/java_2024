package tests;

import models.Student;
import models.StudentsVector;

public class AddAtEndTest {
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
    studentList.add(maria);
    System.out.println("Adicionando items no final da lista: ");
    System.out.println(studentList);
  }
}
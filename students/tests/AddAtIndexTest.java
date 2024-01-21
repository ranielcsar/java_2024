package tests;

import models.Student;
import models.StudentsVector;

public class AddAtIndexTest {
  public static void main(String[] args) {
    Student joao = new Student();
    Student jose = new Student();
    Student maria = new Student();

    joao.setName("João");
    jose.setName("José");
    maria.setName("Maria");

    StudentsVector studentList = new StudentsVector(5);
    studentList.addAt(0, joao);
    studentList.addAt(1, maria);
    studentList.addAt(2, jose);
    System.out.println("Adicionando numa posição específica da lista: ");
    System.out.println(studentList);
  }
}

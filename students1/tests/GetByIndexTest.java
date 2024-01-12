package tests;

import models.Student;
import models.StudentsVector;

public class GetByIndexTest {
  public static void main(String[] args) {
    Student joao = new Student();
    Student jose = new Student();

    joao.setName("João");
    jose.setName("José");

    StudentsVector studentList = new StudentsVector(5);
    studentList.add(joao);
    studentList.add(jose);

    Student student1 = studentList.get(0);
    Student student2 = studentList.get(1);

    System.out.println("Pegando infos de um estudante específico: ");
    System.out.println(student1);
    System.out.println(student2);
  }
}

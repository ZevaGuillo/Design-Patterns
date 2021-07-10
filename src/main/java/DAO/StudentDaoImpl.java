package DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student getStudent(int id) {
        return students.get(id);
    }

    @Override
    public void registerStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
        System.out.println("Estudiante: ID-" + student.getId() + ", Se actulizo");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Estudiante: ID-" + student.getId() + ", Se elimino");
    }
}

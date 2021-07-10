package DAO;

import java.util.List;

public interface StudentDao {

    List<Student> getStudents();
    Student getStudent(int id);
    void registerStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);

}

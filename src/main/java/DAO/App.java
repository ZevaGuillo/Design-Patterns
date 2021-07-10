package DAO;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        Student s1 = new Student("Guillermo",0);
        Student s2 = new Student("David",1);
        Student s3 = new Student("Zevallos",2);
        studentDao.registerStudent(s1);
        studentDao.registerStudent(s2);
        studentDao.registerStudent(s3);

        studentDao.getStudents().forEach(x->System.out.println(x.getName()));

        studentDao.updateStudent(s1);
        studentDao.deleteStudent(s2);
        studentDao.getStudents().forEach(x->System.out.println(x.getName()));

    }
}

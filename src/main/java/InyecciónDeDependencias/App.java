package InyecciónDeDependencias;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Boss());
        employees.add(new Assistant());
        employees.add(new Secretary());

        Proyect proyect = new Proyect(employees);
        proyect.implement();
    }
}

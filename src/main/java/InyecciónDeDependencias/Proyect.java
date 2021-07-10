package InyecciónDeDependencias;

import java.util.List;

public class Proyect {
    private final List<Employee> employees;

    public Proyect(List<Employee> employees) {
        this.employees = employees;
    }

    public void implement() {
        employees.forEach(Employee::work);
    }
}

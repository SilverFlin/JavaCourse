import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1000, "Silver", 2023),
                new Employee(1001, "Mr", 2005),
                new Employee(1003, "Luis", 2009),
                new Employee(1004, "Angel", 2021),
                new Employee(1005, "Toledo", 2020)
        ));

        Employee.EmployeeComparator<Employee> employeeComparator = new Employee.EmployeeComparator<>();

        employees.sort(employeeComparator.reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }


    }
}

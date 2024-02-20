import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 50000, new String[]{"ProjectA","ProjectA", "ProjectB"}, 5);
        Employee emp2 = new Employee(102, "Jane Smith", 60000, new String[]{"ProjectB", "ProjectC"}, 3);

        Company company = new Company(12345, "XYZ Corp", new ArrayList<>(Arrays.asList(emp1, emp2)));

        // Add more employees
        Employee emp3 = new Employee(103, "Alice Johnson", 55000, new String[]{"ProjectA", "ProjectC"}, 4);
        company.addEmployee(emp3);

        Employee emp4 = new Employee(104, "Bob Brown", 65000, new String[]{"ProjectC", "ProjectD"}, 7);
        company.addEmployee(emp4);

        //update projects
        company.updateEmployeeProjectDetails(104, new HashSet<>(Arrays.asList("ProjectA")));
        company.displayEmployeeWorkingOnSameProject("ProjectA");

        // Display all employee details
        List<Employee> allEmployees = company.SortEmpDetailBasedOnSalary();
        System.out.println("\nEmployees List Based on Highest Salary Order");
        for (Employee emp : allEmployees) {
            System.out.println("----------------------");
            System.out.println("Employee ID: " + emp.getEmpId());
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Employee Salary: " + emp.getEmpSalary());
            System.out.println("Projects: " + emp.getProjects());
            System.out.println("Experience: " + emp.getExp());
            System.out.println("----------------------");
        }
    }
}

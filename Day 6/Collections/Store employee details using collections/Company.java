import java.util.*;

public class Company{
    int companyRegNo;
    String companyName;
    List<Employee> employeeList;

    public Company(int companyRegNo, String companyName, List<Employee> employeeList) {
        this.companyRegNo = companyRegNo;
        this.companyName = companyName;
        this.employeeList = employeeList;
    }


    public void addEmployee(Employee emp){
          employeeList.add(emp);
        System.out.println("Emp "+emp.getEmpId()+" added in company");
    }
    public void updateEmployeeProjectDetails(int empId, Set<String> projects){
           for(Employee emp:employeeList){
               if(empId==emp.getEmpId()){
                   emp.setProjects(projects);
                   System.out.println("project details updated for employee ID "+emp.getEmpId());
                   break;
               }
           }
    }
    public List<Employee> displayEmployeeWorkingOnSameProject(String project) {
        List<Employee> employeesWorkingOnSameProject = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getProjects().contains(project)) {
                employeesWorkingOnSameProject.add(emp);
            }
        }
        if (employeesWorkingOnSameProject.isEmpty()) {
            System.out.println("Nobody works on the project " + project);
        } else {
            System.out.println("Employees working on " + project + ":");
            for (Employee emp : employeesWorkingOnSameProject) {
                System.out.println(emp.getEmpName() + " (ID: " + emp.getEmpId() + ")");
            }
        }
        return employeesWorkingOnSameProject;
    }

    public List<Employee> SortEmpDetailBasedOnSalary(){
        employeeList.sort((e1, e2) -> e2.getEmpSalary() - e1.getEmpSalary());
        return employeeList;
    }



}
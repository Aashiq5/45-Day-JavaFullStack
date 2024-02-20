import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Employee {
    int empId;
    String empName;
    int empSalary;
    Set<String> projects;
    int exp;

    public Employee(int empId, String empName, int empSalary, String[] projects, int exp) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.projects = new HashSet<>(Arrays.asList(projects));
        this.exp = exp;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public Set<String> getProjects() {
        return projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}

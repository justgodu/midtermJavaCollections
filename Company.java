import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company implements ICompany {

    private String name;

    private Map<EmployeeType, List<Employee>> employeeMap = new HashMap<>();

    public Company(){}

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void initGroups() {
        for (EmployeeType type : EmployeeType.values()) {
            employeeMap.put(type, new ArrayList<>());
        }
    }

    @Override
    public void addEmployee(EmployeeType type, Employee employee) {
        employeeMap.get(type).add(employee);
    }

    @Override
    public Map<EmployeeType, Double> getAverageSalary() {
        Map<EmployeeType, Double> averagePoints = new HashMap<>();
        for (EmployeeType type : employeeMap.keySet()) {
            List<Employee> employees = employeeMap.get(type);
            double sum = 0.0;
            for (Employee employee : employees) {
                sum = sum + employee.getSalary();
            }
            double average = 0.0;
            if (!employees.isEmpty()) {
                average = sum / employees.size();
            }
            averagePoints.put(type, average);
        }
        return averagePoints;
    }

    @Override
    public void printInfo() {
        for (EmployeeType type : employeeMap.keySet()) {
            System.out.println("პოზიცია: " + type);
            for (Employee employee : employeeMap.get(type)) {
                System.out.println(employee.getName() + ": " + employee.getSalary());
            }
            System.out.println("----------------------");
        }
    }
}

import java.util.Map;

public interface ICompany {
    void initGroups();

    void addEmployee(EmployeeType group, Employee student);

    Map<EmployeeType, Double> getAverageSalary();

    void printInfo();
}

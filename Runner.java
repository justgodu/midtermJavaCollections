import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Employee employee1 = new Employee("ნიკა", 12000);
        Employee employee2 = new Employee("გიო", 300);
        Employee employee3 = new Employee("შაკო", 200);
        Employee employee4 = new Employee("გენოდი", 7000);
        Employee employee5 = new Employee("ვახტანგი", 2300);
        Employee employee6 = new Employee("რევაზი", 666);


        Company company1 = new Company("Google");
        Company company2 = new Company("შ.პ.ს. ფეხსაცმლის შეკეთება");

        company1.initGroups();
        company2.initGroups();
        company1.addEmployee(EmployeeType.ARCHITECT,employee4);
        company1.addEmployee(EmployeeType.BACK_END,employee5);
        company1.addEmployee(EmployeeType.FRONT_END,employee6);

        company2.addEmployee(EmployeeType.ARCHITECT,employee1);
        company2.addEmployee(EmployeeType.BACK_END,employee2);
        company2.addEmployee(EmployeeType.FRONT_END,employee3);

        company1.printInfo();
        company2.printInfo();

        Map<EmployeeType, Double> comp1AveragePoints = company1.getAverageSalary();
        Map<EmployeeType, Double> comp2AveragePoints = company2.getAverageSalary();

        System.out.println(comp1AveragePoints);
        System.out.println(comp2AveragePoints);



    }
}

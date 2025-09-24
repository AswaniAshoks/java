 class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
  
        Employee e1 = new Employee();
         Employee e2 = new Employee();
        e1.setName("Aswani");
        e1.setIdNumber(1001);
        e1.setDepartment("Marketing");
        e1.setSalary(45000);
        e2.setName("Megha");
        e2.setIdNumber(1002);
        e2.setDepartment("Operations");
        e2.setSalary(48000);
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("ID Number: " + e1.getIdNumber());
        System.out.println("Department: " + e1.getDepartment());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Employee 2 Details:");
        System.out.println("Name: " + e2.getName());
        System.out.println("ID Number: " + e2.getIdNumber());
        System.out.println("Department: " + e2.getDepartment());
        System.out.println("Salary: " + e2.getSalary());
    }
}


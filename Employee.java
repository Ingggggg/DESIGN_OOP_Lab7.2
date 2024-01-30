// Component
public class Employee implements EmployeeComponent {
    private String name;
    private String position;
    private int salary;
    
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String dept) {
        this.position = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }
}
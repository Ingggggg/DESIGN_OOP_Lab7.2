// Composite

import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private String name;
    private String position;
    private int salary;
    private List<EmployeeComponent> subordinates;

    public Manager(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(EmployeeComponent subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
        for (EmployeeComponent subordinate : subordinates) {
            subordinate.print();
        }
    }
}
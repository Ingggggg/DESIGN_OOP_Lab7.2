public class App {
    public static void main(String[] args) {
        Manager ceo = new Manager("Settha", "CEO", 500000);
        Manager headSales = new Manager("Kamphaka", "Head Sales", 300000);
        Employee sales1 = new Employee("Wiroj", "Sales", 150000);
        Employee sales2 = new Employee("Weeranan", "Sales", 100000);

        Manager headMarketing = new Manager("UngInk", "Head Marketing", 300000);
        Employee marketing1 = new Employee("Oak", "Marketing", 200000);
        Employee marketing2 = new Employee("Aem", "Marketing", 250000);

        headSales.addSubordinate(sales1);
        headSales.addSubordinate(sales2);

        headMarketing.addSubordinate(marketing1);
        headMarketing.addSubordinate(marketing2);

        ceo.addSubordinate(headSales);
        ceo.addSubordinate(headMarketing);

        printAllEmployee(ceo);
    }
    public static void printAllEmployee(EmployeeComponent employee) {
        employee.print();
    }
}
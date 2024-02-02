public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);

        Employee saleHead = new Employee("Kamphaka", "Head Sales", 300000);
        ceo.addSubEmployees(saleHead);

        Employee saleEmp1 = new Employee("Wiroj", "Sales", 150000);
        Employee saleEmp2 = new Employee("Weeranan", "Sales", 100000);
        saleHead.addSubEmployees(saleEmp1);
        saleHead.addSubEmployees(saleEmp2);

        Employee marketingHead = new Employee("UngInk", "Head Marketing", 300000);
        ceo.addSubEmployees(marketingHead);

        Employee marketingEmp1 = new Employee("Oak", "Marketing", 200000);
        Employee marketingEmp2 = new Employee("Aem", "Marketing", 250000);
        marketingHead.addSubEmployees(marketingEmp1);
        marketingHead.addSubEmployees(marketingEmp2);

        printAllEmployee(ceo);
    }
    public static void printAllEmployee(Employee employee) {
        System.out.println(employee);
        for(Employee emp : employee.getSuEmployees()) {
            printAllEmployee(emp);
        }
    }
}

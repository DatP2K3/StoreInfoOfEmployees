public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("1", "Đạt Phan", 21);
        Employee employee2 = new Employee("2", "Lộc Vũ", 21);
        Employee employee3 = new Employee("3", "Đạt Phan", 21);
        Employee employee4 = new Employee("3", "Nam Anh", 21);
        Employee.employees.add(employee1);
        Employee.employees.add(employee2);
        Employee.employees.add(employee3);
        Employee.employees.add(employee4);
        System.out.println("List of employees:");
        System.out.printf("%-10s%-20s%-10s\n", "ID", "Name", "Age");
        for (Employee employee : Employee.employees) {
            System.out.println(employee);
        }
    }
}
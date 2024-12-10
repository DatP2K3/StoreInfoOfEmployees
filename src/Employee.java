import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
    public static Set<Employee> employees = new HashSet<>();
    private String id;
    private String name;
    private int age;

    public Employee(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-10d", id, name, age);
    }
}

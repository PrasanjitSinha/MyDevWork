import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }*/

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + salary;
        return result;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Ansh", 1000);
        Employee e2 = new Employee("Ansh", 1000);

        HashMap<Employee, String> map = new HashMap<>();

        map.put(e1, "new data");
        map.put(e2,"new test data");

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(map.get(e2));

    }
}

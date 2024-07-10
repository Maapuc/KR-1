import java.util.Objects;

public class Employee {
    private static int idСounter = 1;

    private final int id;
    private final String firstName;
    private final String LastName;
    private final String surName;
    private int salary;
    private int department;

    public Employee(int id, String firstName, String lastName, String surName, int salary, int department) {
        this.id = idСounter++;
        this.firstName = firstName;
        this.LastName = lastName;
        this.surName = surName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(firstName, employee.firstName) && Objects.equals(LastName, employee.LastName) && Objects.equals(surName, employee.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, LastName, surName, salary, department);
    }

}

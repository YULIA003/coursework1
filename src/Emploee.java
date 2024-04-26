import java.util.Objects;

public class Emploee {

    private static Long COUNTER = 1L;
    private final String fullName;
    private int department;
    private double salary;
    private final Long id;


    public Emploee(String fullName, int department, double salary) {
        this.id = COUNTER++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emploee emploee = (Emploee) o;
        return department == emploee.department && Double.compare(salary, emploee.salary) == 0 && Objects.equals(fullName, emploee.fullName) && Objects.equals(id, emploee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

}

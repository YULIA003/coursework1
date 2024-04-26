import java.util.Random;

public class Main {

    private static final Employee[] employees = new Employee[10];
    private static final Random random = new Random(2);

    public static void main(String[] args) {
        for (int i = 0; i < employees.length; i++) {
            double salary = Math.round(20_000 + 50_000 * random.nextDouble());
            employees[i] = new Employee("ФИО сотрудника " + i,
                    random.nextInt(1,6), salary);
            System.out.println(employees[i]);
        }

        printAlL();
        changeSalaryByPercent(50);
        System.out.println();
        printAlL();
    }

    private static void printAlL() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double getSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum +=employee.getSalary();
        }
        return sum;
    }
    private static Employee getEmployeeWithMinSalary(){
        Employee min = employees[0];
        for (Employee employee : employees) {
            if(employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee getEmployeeWithMaxSalary(){
        Employee max = employees[0];
        for (Employee employee : employees) {
            if(employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    private static double getAverageSalary(){
        return getSalarySum() / employees.length;
    }
    private static void printAllNames(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    private static void changeSalaryByPercent(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100.0 * percent);
        }
    }

    private static double getSalarySum(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (department == employee.getDepartment()) {
                sum +=employee.getSalary();
            }
        }
        return sum;
    }
    private static Employee getEmployeeWithMinSalary(int department){
        Employee min = null;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            if(min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee getEmployeeWithMaxSalary(int department){
        Employee max = null;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            if(max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    private static double getAverageSalary(int department) {
        int quantity = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()){
                continue;
            }
            quantity++;
            salarySum+=employee.getSalary();
        }
        return salarySum / quantity;
    }

    private static void changeSalaryByPercent(int percent, int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()){
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100.0 * percent);
        }
    }

    private static void printAll(int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()){
                continue;
            }
            System.out.println(employee);
        }
    }
    private static void printAllAllWithSalaryMore (double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s%n",
                        employee.getFullName(), employee.getId(), employee.getSalary()));
            }
        }
    }

    private static void printAllAllWithSalaryLess (double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s%n",
                        employee.getFullName(), employee.getId(), employee.getSalary()));
            }
        }
    }
}
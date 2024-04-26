import java.util.Random;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int storageSize) {
        employees = new Employee[storageSize];
    }

    public Employee getById(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public boolean add(String name, double salary, int department){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, department, salary);
                return true;
            }
        }
        return false;
    }

    public void delete(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

        public  void printAlL() {
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                System.out.println(employee);
            }
        }

        public  double getSalarySum() {
            double sum = 0;
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                sum +=employee.getSalary();
            }
            return sum;
        }
        public  Employee getEmployeeWithMinSalary(){
            Employee min = employees[0];
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if(employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
            return min;
        }

        public  Employee getEmployeeWithMaxSalary(){
            Employee max = employees[0];
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if(employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
            return max;
        }
        public  double getAverageSalary(){
            int quantity = 0;
            double salarySum = 0;
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                quantity++;
                salarySum+=employee.getSalary();
            }
            return salarySum / quantity;
        }
        public  void printAllNames(){
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                System.out.println(employee.getFullName());
            }
        }

        public  void changeSalaryByPercent(int percent) {
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100.0 * percent);
            }
        }

        public  double getSalarySum(int department) {
            double sum = 0;
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (department == employee.getDepartment()) {
                    sum +=employee.getSalary();
                }
            }
            return sum;
        }
        public  Employee getEmployeeWithMinSalary(int department){
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

        public  Employee getEmployeeWithMaxSalary(int department){
            Employee max = null;
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (department != employee.getDepartment()) {
                    continue;
                }
                if(max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
            return max;
        }
        public  double getAverageSalary(int department) {
            int quantity = 0;
            double salarySum = 0;
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (department != employee.getDepartment()){
                    continue;
                }
                quantity++;
                salarySum+=employee.getSalary();
            }
            return salarySum / quantity;
        }

        public  void changeSalaryByPercent(int percent, int department) {
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (department != employee.getDepartment()){
                    continue;
                }
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100.0 * percent);
            }
        }

        public  void printAll(int department) {
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (department != employee.getDepartment()){
                    continue;
                }
                System.out.println(employee);
            }
        }
        public  void printAllAllWithSalaryMore (double salary) {
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (employee.getSalary() >= salary) {
                    System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s%n",
                            employee.getFullName(), employee.getId(), employee.getSalary()));
                }
            }
        }

        public  void printAllAllWithSalaryLess (double salary) {
            for (Employee employee : employees) {
                if (employee==null){
                    continue;
                }
                if (employee.getSalary() < salary) {
                    System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s%n",
                            employee.getFullName(), employee.getId(), employee.getSalary()));
                }
            }
        }
    }



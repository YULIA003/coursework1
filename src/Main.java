import java.util.Random;

public class Main {

    private static final Employee[] employees = new Employee[10];


    private static final Random random = new Random(2);

    public static void main(String[] args) {
      EmployeeBook employeeBook = new EmployeeBook(5);
      employeeBook.add("Ivanov Ivan", 25000, 1);
      employeeBook.add("Sergeev Sergey", 39000, 2);
      employeeBook.add("Mishakov Misha", 78000, 4);
      employeeBook.add("Simonov Semen", 33000, 3);

        employeeBook.printAll(2);
        System.out.println(employeeBook.getSalarySum(2));
        employeeBook.changeSalaryByPercent(100,1);
        System.out.println();
        employeeBook.printAlL();
    }
}
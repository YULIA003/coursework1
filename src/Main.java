import java.util.Random;

public class Main {

    private static final Emploee[] emploees = new Emploee[10];
    private static final Random random = new Random(1);

    public static void main(String[] args) {
        for (int i = 0; i < emploees.length; i++) {
            double salary = Math.round(20_000 + 50_000 * random.nextDouble());
            emploees[i] = new Emploee("ФИО сотрудника " + i,
                    random.nextInt(1,6), salary);
            System.out.println(emploees[i]);
        }

        printAll();
        System.out.println(getSalarySum());
        System.out.println(getEmploeeWithMinSalary());
        System.out.println(getEmploeeWithMaxSalary());
        System.out.println(getAverageSalary());
        printAllNames();
    }

    private static void printAll() {
        for (Emploee emploee : emploees) {
            System.out.println(emploee);
        }
    }

    private static double getSalarySum() {
        double sum = 0;
        for (Emploee emploee : emploees) {
            sum +=emploee.getSalary();
        }
        return sum;
    }
    private static Emploee getEmploeeWithMinSalary(){
        Emploee min = emploees[0];
        for (Emploee emploee : emploees) {
            if(emploee.getSalary() < min.getSalary()) {
                min = emploee;
            }
        }
        return min;
    }

    private static Emploee getEmploeeWithMaxSalary(){
        Emploee max = emploees[0];
        for (Emploee emploee : emploees) {
            if(emploee.getSalary() > max.getSalary()) {
                max = emploee;
            }
        }
        return max;
    }
    private static double getAverageSalary(){
        return getSalarySum() / emploees.length;
    }
    private static void printAllNames(){
        for (Emploee emploee : emploees) {
            System.out.println(emploee.getFullName());
        }
    }
}
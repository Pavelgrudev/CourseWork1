package COURSEWORK;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeBook = new Employee[10];
        Employee vasya = new Employee("Vasya", 1, 48909);
        Employee petya = new Employee("Petya", 2, 49011);
        Employee pavlik = new Employee("Pavlik", 3, 51037);
        employeeBook[0] = vasya;
        employeeBook[1] = petya;
        employeeBook[2] = pavlik;

        System.out.println("==============================================================");
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(pavlik);
        System.out.println("==============================================================");
        System.out.println(+getTotalSalary(employeeBook) + " рублей, сумма затрат на зарплаты в месяц");
        System.out.println(getMinSalary(employeeBook) + " рублей, минимальная зарплата сотрудника");
        System.out.println(getMaxSalary(employeeBook) + " рублей, максимальная зарплата сотрудника");
        System.out.println(getAverageSalary(employeeBook) + " рублей = Средняя зарплата.");
        System.out.println(vasya.toString() + "   " + petya.toString() + "    " + pavlik.toString());
    }

    public static double getTotalSalary(Employee[] salaryes) {
        double sum = 0;
        for (Employee employee : salaryes)
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        return   sum;
    }

    public static double getMinSalary(Employee[] minS) {
        double sum = Double.MAX_VALUE;
        for (Employee employee : minS)
            if (employee == null) {
            } else if (employee.getSalary() < sum) {
                sum = employee.getSalary();
            }
        return sum;
    }

    public static double getMaxSalary(Employee[] maxS) {
        double sum = Double.MIN_VALUE;
        for (Employee employee : maxS)
            if (employee == null) {
            } else if (employee.getSalary() > sum) {
                sum = employee.getSalary();
            }
        return sum;
    }

    public static double getAverageSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();

            }
        }
        return sum = sum / Employee.count;
    }


}























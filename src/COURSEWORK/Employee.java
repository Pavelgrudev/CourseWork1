
package COURSEWORK;

public class Employee {
    private String name;
    private int department;
    private double salary;
    public static int count = 0;
    private int id;

    public Employee(String name, int department, int salary) {

        count++;
        this.id = count;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public int getDepartament() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "ФИО Сотрудника = " + name + '\'' +
                        ", Департамент № " + department +
                        ", Зарплата = " + salary;
    }


}











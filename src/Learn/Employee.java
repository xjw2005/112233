package Learn;

import java.io.Serializable;

public class Employee implements Serializable {
    private String employeeName;
    private double employeeSalary;

    public Employee(String employeeName, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    //加薪水
    public void raiseSalary(double byPercent) {
        double raise = employeeSalary * byPercent / 100;
        employeeSalary += raise;
    }

    public String toString() {
        return getClass().getName() +"Employee[name=" + employeeName + ",salary=" + employeeSalary + "]";
    }
}

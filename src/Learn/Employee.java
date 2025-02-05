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


}

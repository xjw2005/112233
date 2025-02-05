package Learn;

public class Manager extends Employee{
    private Employee secretary;

    public Manager(String employeeName, double employeeSalary) {
        super(employeeName, employeeSalary);
        secretary = null;
    }


}

package Learn;

public class Manager extends Employee {
    private Employee secretary;

    public Manager(String employeeName, double employeeSalary) {
        super(employeeName, employeeSalary);
        secretary = null;
    }

    //设置秘书
    public void setSecretary(Employee employee) {
        secretary = employee;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[secretary=" + secretary + "]";
    }

}

import Learn.Employee;
import Learn.Manager;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        //序列化和反序列化
        Employee harry = new Employee("Harry Hacker", 50000);
        Manager manager1 = new Manager("Tony Tester", 100000);
        manager1.setSecretary(harry);

        Employee[] staff = new Employee[3];
        staff[0] = harry;
        staff[1] = manager1;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(staff);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
            Employee[] newStaff = (Employee[]) in.readObject();
            in.close();
            newStaff[0].raiseSalary(10);
            for (int i = 0; i < newStaff.length; i++) {
                System.out.println(newStaff[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
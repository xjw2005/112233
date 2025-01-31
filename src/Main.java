import Learn.Student;
import Learn.Utils;

public class Main {

    public static void main(String[] args) {
        Student xiaoMing = new Student("小明", 1);
        Student xiongJianWen = new Student("熊健文", 59);
        xiongJianWen.age = 20;
        xiongJianWen.score = 61;

        xiongJianWen.goToClass();
        System.out.println(xiongJianWen.toString());

        int ret = Utils.compare(8, 6);
        System.out.println("比较的返回结果是：" + ret);

        boolean ret2 = xiaoMing.equals(xiongJianWen);
        System.out.println("两个对象的比较结果是：" + ret2);

    }
}
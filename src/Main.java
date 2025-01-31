import Learn.Student;
import Learn.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        Student xiaoMing = new Student("小明", 1);
        Student xiongJianWen = new Student("熊健文", 59);
        xiongJianWen.age = 20;
        xiongJianWen.score = 61;

        xiongJianWen.goToClass();
//        JButton jb = new JButton();
//        ActionListener actionListener = new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(-1);
//            }
//        };
//
//        jb.addActionListener(actionListener
//        );

        System.out.println(xiongJianWen.toString());

        int ret = Utils.compare(8, 6);
        System.out.println("比较的返回结果是：" + ret);

        boolean ret2 = xiaoMing.equals(
                new Student("健文", 1)
        );
        System.out.println("两个对象的比较结果是：" + ret2);

    }
}
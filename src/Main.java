import Learn.Cat;
import Learn.Dog;
import Learn.IRun;
import Learn.Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Scanner 测试：

//        System.out.println("请输入数据：");
//        String str = scanner.next();
//        System.out.println("输入的数据为：" + str);

        //测试输入小数。
        while (true) {
            System.out.println("请输入小数。");
            if (scanner.hasNextFloat()) {
                System.out.println("输入的为：" + scanner.nextFloat());
            } else {
                System.out.println("输入的不是小数。");
                return;
            }

        }


    }
}
import Learn.Cat;
import Learn.Dog;
import Learn.IRun;
import Learn.Manager;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        //Scanner 测试：

        System.out.println("请输入日期（格式：yyyy-MM-dd）：");
        String inputDate = scanner.nextLine();
//        System.out.println("请输入数据：");
//        String str = scanner.next();
//        System.out.println("输入的数据为：" + str);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outPutFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        try {
            LocalDate date = LocalDate.parse(inputDate, formatter);
            String formattedDate = date.format(outPutFormatter);
            System.out.println("解析成功的日期是：" + formattedDate);
        } catch (DateTimeParseException e) {
            System.out.println("输入的日期格式不正确，请检查输入。");
        }

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
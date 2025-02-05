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

        System.out.println("请输入日期（格式：yyyy-MM-dd）：");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outPutFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        try {
            LocalDate date = LocalDate.parse(inputDate, formatter);
            String formattedDate = date.format(outPutFormatter);
            System.out.println("解析成功的日期是：" + formattedDate);
        } catch (DateTimeParseException e) {
            System.out.println("输入的日期格式不正确，请检查输入。");
        }

    }
}
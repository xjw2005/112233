import Learn.Cat;
import Learn.Dog;
import Learn.IRun;
import Learn.Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        int sum = 0;

        File myFirstFile = new File("C:\\Users\\12909\\Desktop\\desktopFolder\\myFirstFile.txt");
        File mySecondFile = new File("C:\\Users\\12909\\Desktop\\desktopFolder\\mySecondFile.dat");

        myFirstFile.createNewFile();
        mySecondFile.createNewFile();
        //判断文件是否存在

        if (myFirstFile.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");
        }

        //判断是否是文件夹
        if (myFirstFile.isDirectory()) {
            System.out.println("是文件夹");
        } else {
            System.out.println("不是文件夹");
        }

        if (myFirstFile.canRead() && myFirstFile.canWrite()) {
            System.out.println("可以读写");
        }

//        //提示输入数据，并且以#结束
//        System.out.println("请输入数据，以#结束");

        //创建文件输入字节流
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(myFirstFile);
//            while (true) {
//                int input;
//                while ((input = System.in.read()) != '#') {
//                    fileOutputStream.write(input);
//                }
//                System.out.println("写入完成。");
//                break;
//            }
//        } catch (IOException e) {
//            System.out.println(e.toString());
//        }
//        //读取文件里的内容
//        System.out.println("################################################################################");
//        try {
//            FileInputStream fileInputStream = new FileInputStream(myFirstFile);
//            while (fileInputStream.read(buffer) != -1) {
//                System.out.println(new String(buffer));
//            }
//            System.out.println("读取完成");
//            fileInputStream.close();
//        }
//        catch (IOException e) {
//            System.out.println("读取文件是出错。");
//        }
//        try{
//            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(mySecondFile));
//            dataOutputStream.writeInt(255);
//            dataOutputStream.writeInt(-1);
//            dataOutputStream.writeInt(0);
//
//            System.out.println("写入成功。");
//        }
//        catch (IOException e) {
//            System.out.println("Problem reading" + myFirstFile.toString());
//        }

        try{
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(mySecondFile));
            sum += dataInputStream.readInt();
            sum += dataInputStream.readInt();
            sum += dataInputStream.readInt();

            System.out.println("sum = " + sum);
        }
        catch (IOException e) {
            System.out.println("Problem reading" + myFirstFile.toString());
        }
    }
}
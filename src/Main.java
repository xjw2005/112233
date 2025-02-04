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
        String fileName = "C:\\Users\\12909\\Desktop\\desktopFolder\\testBufferedWriter.txt";


//        try {
//            FileWriter writerMan = new FileWriter(fileName, false);
//            writerMan.write("This is a test.");
//            System.out.println("Successfully wrote to the file.");
//            writerMan.close();
//        }
//        catch (IOException e){
//            System.out.println("Problem writing " + fileName);
//        }

        //BufferedWriter测试
//        try {
//            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(fileName, false));
//            bufferWriter.write("This is the second test. ho~wa!!!");
//            bufferWriter.newLine();
//            bufferWriter.write("Today is a lovely day again!");
//            bufferWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        }
//        catch (IOException e){
//            System.out.println("Problem writing " + fileName);
//        }

        //测试BufferedReader

        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
            String line = bufferReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Problem reading " + fileName);
        }
    }
}
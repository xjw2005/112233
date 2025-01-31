import Learn.Animal;
import Learn.Cat;
import Learn.Student;
import Learn.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("cat");
        animal.scream();
        Cat cat = new Cat("xiaoXiong");
        cat.scream();

        System.out.println("我的猫的名字是：" + cat.getName());
        Animal cat2 = new Cat("xiaoXiong2");
        cat2.scream();

    }
}
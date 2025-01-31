import Learn.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {

//        Fruit apple = new Fruit(){
//
//            @Override
//            public void rotten() {
//                System.out.println("apple rotten time is 4 days.");
//            }
//        };

        Apple apple = new Apple();
        System.out.println(apple.name);


    }
}
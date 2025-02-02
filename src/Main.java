import Learn.Cat;
import Learn.Dog;
import Learn.IRun;
import Learn.Manager;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        final String ANIMAL_SELECTED_FIRST = "myFirstAnimal";
        final String ANIMAL_SELECTED_SECOND = "mySecondAnimal";
        final String OPERATOR_NAME = "大明";

        Manager<String, IRun> manager = new Manager<>(new HashMap<String, IRun>());
        Cat myCat = new Cat("xiaoXiong");
        Dog myDog = new Dog("pePerPe");

        manager.set(ANIMAL_SELECTED_FIRST, myCat);
        manager.set(ANIMAL_SELECTED_SECOND, myDog);

        manager.run(ANIMAL_SELECTED_FIRST);
        manager.run(ANIMAL_SELECTED_SECOND);
        //迭代器的使用测试：

//        for (String key : manager.keySet()) {
//            System.out.println(key);
//        }


        IRun testAnimal = manager.get(ANIMAL_SELECTED_FIRST);
        IRun testAnimal2 = manager.get(ANIMAL_SELECTED_SECOND);

        System.out.println(testAnimal);
        System.out.println(testAnimal2);

    }
}
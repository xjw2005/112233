package Learn;
import Learn.Animal;

public class Cat extends Animal implements IRun,IEat{
    public String colour;


    public Cat(String name) {
        super(name);
    }
    @Override
    public void scream() {
        System.out.println("喵喵喵");
    }

    @Override
    public void run() {
        System.out.println("Cat is running 10 killometers per step.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is running 10 killometers per step.");
    }
}

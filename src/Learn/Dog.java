package Learn;

public class Dog extends Animal implements IRun,IEat {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}

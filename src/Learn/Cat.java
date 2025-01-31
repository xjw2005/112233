package Learn;
import Learn.Animal;

public class Cat extends Animal{
    public String colour;


    public Cat(String name) {
        super(name);
    }
    @Override
    public void scream() {
        System.out.println("喵喵喵");
    }

}

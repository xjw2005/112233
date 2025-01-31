package Learn;

public class Apple extends Fruit {

    public Apple(){
        super.name = "apple";
    }
    @Override
    public void rotten() {
        System.out.println("apple rotten time is 4 days.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
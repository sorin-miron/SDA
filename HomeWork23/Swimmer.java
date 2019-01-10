package HomeWork1.HomeWork23;

public class Swimmer implements Swim, Breath {
    @Override
    public void breath() {
        System.out.println("A swimmer can breath.");
    }

    @Override
    public void swim() {
        System.out.println("A swimmer can swim.");
    }
}

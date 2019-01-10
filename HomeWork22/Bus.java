package HomeWork1.HomeWork22;

public class Bus extends Vehicle {
    @Override
    public void printState() {
        System.out.println("Bus state: Speed-> " + getSpeed() + ", Gear-> " + getGear() + ".");
    }
}

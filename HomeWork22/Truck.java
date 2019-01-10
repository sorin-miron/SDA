package HomeWork1.HomeWork22;

public class Truck extends Vehicle {
    @Override
    public void printState() {
        System.out.println("Truck state: Speed-> " + getSpeed() + ", Gear-> " + getGear() + ".");
    }
}

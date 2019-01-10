package HomeWork1.HomeWork22;

public abstract class Vehicle {

    private int speed;
    private int gear;

    public void changeGear(int newGear){
        this.gear = newGear;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }

    public void applyBrakes(int decrement){
        this.speed -= decrement;
    }

    public abstract void printState();

    public int getSpeed() {
        return this.speed;
    }

    public int getGear() {
        return this.gear;
    }
}

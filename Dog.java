package HomeWork1;

public class Dog extends Animal {
    private String color;

    public Dog(int age, int numberOfLegs, boolean vegetarian, String color) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark(){
        System.out.println("Bark ! Bark !");
    }

    @Override
    public String toString() {
        String text = super.toString() +
                " and the color='" + color + '\'' + ".";
        return text;
    }
}

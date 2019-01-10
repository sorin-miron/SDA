package HomeWork1;

public class Main {

    public static void main(String[] args) {

        Animal tauras = new Animal(2, 4, true);
        System.out.print("The animal has " + tauras.getAge() + " ani, " +
                tauras.getNumberOfLegs() + " legs and is ");
        if(tauras.isVegetarian()){
            System.out.print("vegetarian.\n");
        } else {
            System.out.print(" NOT vegetarian.\n");
        }

        // Inheritance: 2 si 3 la un loc
        Animal patrocle = new Dog(1, 4, false, "White");
        System.out.print("The dog has " + patrocle.getAge() + " ani, " +
                patrocle.getNumberOfLegs() + " legs and is ");
        if(patrocle.isVegetarian()){
            System.out.print("vegetarian.\n");
        } else {
            System.out.print(" NOT vegetarian.\n");
        }

        ((Dog) patrocle).bark();

        // Inheritance 4.b. - nu se poate chema metoda bark() pe un obiect animal pentru ca metoda nu exista in clasa Animal.
//        tauras.bark();

        // Inheritance: 5 si 6
        System.out.println(patrocle.toString());

        // Inheritance: 7
        Animal animal = new Animal(2,2, true);
        Animal dog = new Dog(1, 4, false, "Black");
        System.out.println("\n" + animal.toString());
        System.out.println(dog.toString());

        // Inheritance: 8
        System.out.println("\nDetails printed from the printAnimalDetails() method.");
        printAnimalDetails(animal);
        printAnimalDetails(dog);

    }

    public static void printAnimalDetails(Animal animal){
        System.out.println(animal.toString());
    }
}

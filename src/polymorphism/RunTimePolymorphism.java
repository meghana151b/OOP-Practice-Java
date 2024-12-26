package polymorphism;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal animal;

        // Parent reference, child object
        animal = new Dog();
        animal.sound();  // Calls Dog's overridden method

        animal = new Cat();
        animal.sound();  // Calls Cat's overridden method
    }
}

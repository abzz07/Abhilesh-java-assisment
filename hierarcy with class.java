class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit jumps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();

        dog.eat();
        dog.bark();

        rabbit.eat();
        rabbit.jump();
    }
}

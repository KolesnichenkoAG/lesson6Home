import lesson6.Animal;
import lesson6.Cat;
import lesson6.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 6 version 1");
        Animal animal = new Animal( "_____");
        Cat cat = new Cat ("Мурзик", "Белый", 150);
        Dog dog = new Dog ("Шарик", "черный", 5);
        cat.animalInfo();
        cat.run();
        cat.swim();
        dog.animalInfo();
        dog.run();
        dog.swim();
    }
}

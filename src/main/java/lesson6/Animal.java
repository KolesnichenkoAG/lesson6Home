package lesson6;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void animalInfo() {
        System.out.println("Животное: " + name);
    }
    public void run() {
        System.out.println("Животное бежит");
    }
    public void swim() {
        System.out.println("Животное плывет");
    }
}




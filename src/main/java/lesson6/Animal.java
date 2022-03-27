package lesson6;

public class Animal {
    String name;
    int distancerun;
    int barrier;
    public Animal(String name, int distancerun, int barrier) {
        this.name = name;
        this.distancerun = distancerun;
        this.barrier = barrier;
    }

    public Animal(String name) {

    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }
    public void run() {
        System.out.println("Животное бежит" + distancerun);
    }
    public void swim() {
        System.out.println("Животное плывет" + barrier);
    }
}




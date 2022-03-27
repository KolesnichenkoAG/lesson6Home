package lesson6;

public class Dog extends Animal {
    String color;
    private int distance;
    public Dog (String name, String color, int distance) {
        super(name);
        this.color = color;
        this.distance = distance;
    }
    @Override
    public void animalInfo() {
        System.out.println("Собака: " + name + "  цвет " + color);
    }
    @Override
    public void run() {
        if (distance > 500) {
            System.out.println(name + " не может бежать " + distance + " метров");
        }
        else
            System.out.println(name + " пробежал " + distance + " метров");
    }
    @Override
    public void swim() {
        if (distance > 10) {
            System.out.println(name + " не может проплыть " + distance + " метров");
        }
        else
        System.out.println(name + " проплыл " + distance + " метров");
    }
}

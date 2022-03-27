package lesson6;

public class Dog extends Animal {
    public Dog (String name, String color, int distancerun, int barrier) {
        super(name, color, distancerun, barrier);
    }
    @Override
    public void animalInfo() {
        System.out.println("Собака: " + name + "  цвет " + color);
    }
    @Override
    public void run() {
        if (distancerun > 500) {
            System.out.println(name + " не может бежать " + distancerun + " метров");
        }
        else
            System.out.println(name + " пробежал " + distancerun + " метров");
    }
    @Override
    public void swim() {
        if (barrier > 10) {
            System.out.println(name + " не может проплыть " + barrier + " метров");
        }
        else
        System.out.println(name + " проплыл " + barrier + " метров");
    }
}

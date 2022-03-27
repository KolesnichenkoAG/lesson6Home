package lesson6;
    public class Cat extends Animal {
        public Cat (String name, String color, int distancerun, int barrier) {
            super(name, color, distancerun, barrier);
        }
        @Override
        public void animalInfo() {
            System.out.println("Кот: " + name + " Цвет " + color);
        }
        @Override
        public void run() {
            if (distancerun > 200) {
            System.out.println(name + " не может бежать " + distancerun + " метров");
            }
            else
            System.out.println(name + " пробежал " + distancerun + " метров");
        }
        @Override
        public void swim() {
            System.out.println("Кот не умеет плавать");
        }
    }

package lesson6;
    public class Cat extends Animal {
        String color;
        private int distance;
        public Cat (String name, String color, int distance) {
            super(name);
            this.color = color;
            this.distance = distance;
        }
        @Override
        public void animalInfo() {
            System.out.println("Кот: " + name + "  цвет " + color);
        }
        @Override
        public void run() {
            if (distance > 200) {
            System.out.println(name + " не может бежать " + distance + " метров");
            }
            else
            System.out.println(name + " пробежал " + distance + " метров");
        }
        @Override
        public void swim() {
            System.out.println("Кот не умеет плавать");
        }
    }

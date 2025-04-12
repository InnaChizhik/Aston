package Lesson_5;

public class Cat extends Animal {
    final int maxDistanceRun = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distance <= maxDistanceRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может столько пробежать, максимальная дистанция: " + maxDistanceRun + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

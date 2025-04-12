package Lesson_5;

public class Dog extends Animal {
    final int maxDistanceRun = 500;
    final int getMaxDistanceSwim = 200;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может столько пробежать, максимальная дистанция: " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= getMaxDistanceSwim) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может столько плыть, максимальная дистанция: " + distance + " м.");
        }
    }


}

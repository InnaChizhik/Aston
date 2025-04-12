package Lesson_5;

public class Dog extends Animal {
    final int maxDistanceRun = 500;
    final int getMaxDistanceSwim = 10;
    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distance <= getMaxDistanceSwim) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может столько плыть, максимальная дистанция: " + getMaxDistanceSwim + " м.");
        }
    }

    public static int infoDogCount() {
        return dogCount;
    }

}

package Lesson_5;

public class Cat extends Animal {
    final int maxDistanceRun = 200;
    static int catCount = 0;
    boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catCount++;
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

    public static int infoCatCount() {
        return catCount;
    }

    public void eatCat(Bowl bowl, int foodNeed) {
        if (!satiety) {
            satiety = bowl.satietyCat(foodNeed);
        }
    }

    public void infoSatienty() {
        if (satiety == true) {
            System.out.println(name + " сытый.");
        } else {
            System.out.println(name + " голоден.");
        }
    }
}

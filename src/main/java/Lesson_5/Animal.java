package Lesson_5;

public abstract class Animal {
    String name;
    static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int infoAnimalCount() {
        return animalCount;
    }
}

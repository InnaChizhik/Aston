package Lesson_5;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(550);
        dogBobik.swim(2);
        Cat catMurzik = new Cat("Мурзик");
        catMurzik.swim(5);
        System.out.println("Котов: " + Cat.infoCatCount());
        System.out.println("Собак: " + Dog.infoDogCount());
        System.out.println("Всего животных: " + Animal.infoAnimalCount());
    }

}

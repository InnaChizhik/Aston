package Lesson_5;

import java.util.ArrayList;

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
        Bowl bowl = new Bowl(15);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Тофик"));
        cats.add(new Cat("Умка"));
        for (int i = 0; i < cats.size(); i++) {
            Cat cat = cats.get(i);
            cat.eatCat(bowl, 10);
        }
        for (int i = 0; i < cats.size(); i++) {
            Cat cat = cats.get(i);
            cat.infoSatienty();
        }
        bowl.addFood(10);
        for (int i = 0; i < cats.size(); i++) {
            Cat cat = cats.get(i);
            cat.eatCat(bowl, 10);
        }
        for (int i = 0; i < cats.size(); i++) {
            Cat cat = cats.get(i);
            cat.infoSatienty();
        }


    }

}

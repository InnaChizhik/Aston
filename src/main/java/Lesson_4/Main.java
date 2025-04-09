package Lesson_4;

public class Main {
    public static void main(String[] args) {

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Xiaomi 15", "22.02.2025", "Xiaomi", "China", 360.90, true);
        productsArray[1] = new Product("Xiaomi 15 Pro", "12.03.2025", "Xiaomi", "China", 440.00, true);
        productsArray[2] = new Product("Xiaomi 16", "27.04.2025", "Xiaomi", "China", 500.20, true);
        productsArray[3] = new Product("Xiaomi 16 Pro", "04.05.2025", "Xiaomi", "China", 530.90, true);
        productsArray[4] = new Product("Xiaomi 16 Pro Max", "08.06.2025", "Xiaomi", "China", 560.90, true);
        productsArray[0].getInfo();
        productsArray[1].getInfo();
        productsArray[2].getInfo();
        productsArray[3].getInfo();
        productsArray[4].getInfo();
        Park.Attraction park1 = new Park("Парк Челюскинцев", "11.00 - 21.00").new Attraction("Ладья", "11.00 - 20.40", 5.60);
        park1.getInfo();




    }

}

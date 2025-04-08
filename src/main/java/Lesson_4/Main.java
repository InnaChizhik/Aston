package Lesson_4;

public class Main {
    public static void main(String[] args) {

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("app", 23, "efs", "minsk", 5.90, true);
        productsArray[1] = new Product("app", 23, "efs", "minsk", 5.90, true);
        productsArray[2] = new Product("app", 23, "efs", "minsk", 5.90, true);
        productsArray[3] = new Product("app", 23, "efs", "minsk", 5.90, true);
        productsArray[4] = new Product("app", 23, "efs", "minsk", 5.90, true);
        productsArray[0].getInfo();
        productsArray[1].getInfo();
        productsArray[2].getInfo();
        productsArray[3].getInfo();
        productsArray[4].getInfo();
        Park.Attraction attraction = new Park("park chelusk", 7).new Attraction("d","90", 4.60);




    }

}

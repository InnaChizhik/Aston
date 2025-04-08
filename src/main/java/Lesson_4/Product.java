package Lesson_4;

public class Product {
    private String name;
    private int date;
    private String manufacturer;
    private String country;
    private double price;
    private boolean reserv;
        Product(String name,int date, String manufacturer, String country,double price, boolean reserv){
            this.name = name;
            this.date = date;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.reserv = reserv;

        }
        void getInfo(){
            System.out.println(name+ " " + date+ " " + manufacturer + " " + country + " " + price + " " + reserv);
        }
}

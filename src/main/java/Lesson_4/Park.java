package Lesson_4;

public class Park {
    private String name;
    private String time;


    Park(String name, String time) {
        this.name = name;
        this.time = time;
    }
    void getInfo(){
        System.out.println(name + ". " +  "Время работы: " + time);
    }


    class Attraction {
       private String attractionName;
       private String workingHours;
       private double price;

        Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }
        void getInfo(){
            System.out.println("Аттракцион: " + attractionName + ". " + "Время работы " + workingHours+ ". " + "Цена: " +price);
        }


    }


    }


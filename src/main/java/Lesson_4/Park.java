package Lesson_4;

public class Park {
    private String name;
    private Attraction[] attraction;

    Park(String name, Attraction[] attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    class Attraction {
        String attractionName;
        String workingHours;
        double price;

        Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }
    }


    }


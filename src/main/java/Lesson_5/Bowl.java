package Lesson_5;

public class Bowl {
    int foodCount;

    public Bowl(int startFood) {
        if (startFood < 0) {
            this.foodCount = 0;
        } else {
            this.foodCount = startFood;
        }
    }

    public void addFood(int caunt) {
        if (caunt > 0) {
            foodCount = foodCount + caunt;
        } else {
            System.out.println("Количество добавляемой еды должно быть положительным числом");
        }
    }

    boolean satietyCat(int needFood) {
        if (needFood <= foodCount) {
            foodCount = foodCount - needFood;
            return true;
        } else {
            System.out.println("Мало еды в миске ");
            return false;
        }
    }
}

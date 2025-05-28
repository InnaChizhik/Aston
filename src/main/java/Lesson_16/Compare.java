package Lesson_16;

public class Compare {
    public static String compareNumder(int x, int y) {
        if (x == y) {
            return "Равны";
        } else if (x > y) {
            return "Первое больше";
        } else {
            return "Второе больше";
        }
    }
}

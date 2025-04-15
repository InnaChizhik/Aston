package Lesson_6;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = new String[4][4];
        String[][] incorrectArray = new String[3][4];
        try {
            Methods.arraySize(correctArray);
            Methods.arraySize(incorrectArray);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

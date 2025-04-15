package Lesson_6;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] incorrectArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "3"},
                {"13", "2", "15"}
        };
        String[][] incorrectArray2 = {
                {"0", "1", "2", "3"},
                {"5", "1", "a", "8"},
                {"9", "10", "11", "3"},
                {"13", "2", "16", "5"}
        };
        try {
            System.out.println("Сумма " + Methods.arraySize(correctArray));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма " + Methods.arraySize(incorrectArray));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма " + Methods.arraySize(incorrectArray2));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        int[] checkArray = {1, 2};
        try {
            System.out.println(checkArray[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива ");
        }
    }
}

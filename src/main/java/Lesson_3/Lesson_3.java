package Lesson_3;

public class Lesson_3 {
    static int[] num = {1, 1, 1, 1, 0, 0, 0, 0};
    static int[] arr = new int[100];
    static int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[][] arr2 = new int[4][4];

    public static void main(String[] args) {
        printThreeWords();
        CheckSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSum(10, 90));
        checkNumbers(-3);
        System.out.println(testNumbers(0));
        strNum("ha", 3);
        System.out.println(godVis(100));
        arrayNum(num);
        arrayPustoy(arr);
        arrayPerebor(arr1);
        diagArray(arr2);
        printVal(massVal(3, 4));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void CheckSumSign() {
        int a = 5;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 100;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else
            return false;
    }

    public static void checkNumbers(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else
            System.out.println("Отрицательное");

    }

    public static boolean testNumbers(int a) {
        if (a >= 0) {
            return false;
        } else
            return true;
    }

    public static void strNum(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }

    }

    public static boolean godVis(int g) {
        if (!(g % 4 == 0) || !(g % 400 == 0) && (g % 100 == 0)) {
            return false;
        } else
            return true;
    }

    public static void arrayNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                num[i] = 0;
            } else {
                num[i] = 1;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println(" "); // переход на новую строку
    }

    public static void arrayPustoy(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println(" "); // переход на новую строку
    }

    public static void arrayPerebor(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                arr1[i] = arr1[i] * 2;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" "); // переход на новую строку
    }

    public static void diagArray(int[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0, l = arr2[i].length - 1; j < arr2[i].length; j++, l--) {
                if (i == j || i == l-j)
                {arr2[i][j] = 1;}
                else
                    arr2[i][j] = 0;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static int[] massVal( int len, int initialValue){
        int arr3[] = new int[len];
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = initialValue;
        }
        return arr3;
    }
    public static void printVal(int[] arr4){
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
    }
}




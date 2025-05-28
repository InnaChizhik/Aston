package Lesson_16;

public class Factorial {
    public static int calculatorFactorial(int n) {
        int f = 1;
        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                f = f * i;
            }
        }
        return f;
    }
}

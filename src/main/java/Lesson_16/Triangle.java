package Lesson_16;

public class Triangle {
    public static double calculatorTriangleArea(int a, int b, int c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

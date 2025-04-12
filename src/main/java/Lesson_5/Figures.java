package Lesson_5;

public interface Figures {
    double calculatorSquare();

    String infoFillColor();

    String infoOutlineColor();

    default double calculatorPerimeter() {
        return 0;
    }

    void infoColor();
}

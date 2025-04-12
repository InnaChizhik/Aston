package Lesson_5;

public class Circle implements Figures {
    double radius;
    String fillColor;
    String outlineColor;

    public Circle(double radius, String fillColor, String outlineColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.outlineColor = outlineColor;
    }

    @Override
    public double calculatorSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String infoFillColor() {
        return fillColor;
    }

    @Override
    public String infoOutlineColor() {
        return outlineColor;
    }

    @Override
    public void infoColor() {
        System.out.println("Цвет заливки круга " + fillColor + ", цвет контура " + outlineColor);
    }
}

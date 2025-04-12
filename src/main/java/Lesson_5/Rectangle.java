package Lesson_5;

public class Rectangle implements Figures {
    double width;
    double height;
    String fillColor;
    String outlineColor;

    public Rectangle(double width, double height, String fillColor, String outlineColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.outlineColor = outlineColor;
    }

    @Override
    public double calculatorSquare() {
        return width * height;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * (width + height);
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
        System.out.println("Цвет заливки прямоугольника " + fillColor + ", цвет контура " + outlineColor);
    }
}

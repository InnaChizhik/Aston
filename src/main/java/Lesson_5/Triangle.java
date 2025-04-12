package Lesson_5;

public class Triangle implements Figures {
    double side1, side2, side3;
    String fillColor;
    String outlineColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String outlineColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.outlineColor = outlineColor;
    }

    @Override
    public double calculatorSquare() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
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
    public double calculatorPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void infoColor() {
        System.out.println("Цвет заливки треугольника " + fillColor + ", цвет контура " + outlineColor);
    }
}

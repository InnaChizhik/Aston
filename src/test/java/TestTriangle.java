import Lesson_16.Factorial;
import Lesson_16.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestTriangle {
    @ParameterizedTest
    @CsvSource({"3, 4, 5, 6", "7, 24, 25, 84", "9, 40, 41, 180"})
    public void testTriangleArea(int a, int b, int c, int actual) {
        Assertions.assertEquals(Triangle.calculatorTriangleArea(a, b, c), actual);
    }
}

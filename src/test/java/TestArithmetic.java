import Lesson_16.Arithmetic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestArithmetic {
    @DisplayName("Плюс")
    @ParameterizedTest
    @CsvSource({"3, 4, 7", "1, 1, 2", "9, 40, 49"})
    public void testArithmeticPlus(int a, int b, int actual) {
        Assertions.assertEquals(Arithmetic.plus(a, b), actual);
    }

    @DisplayName("Минус")
    @ParameterizedTest
    @CsvSource({"3, 4, -1", "1, 1, 0", "9, 40, -31"})
    public void testArithmeticMinus(int a, int b, int actual) {
        Assertions.assertEquals(Arithmetic.minus(a, b), actual);
    }

    @DisplayName("Умножение")
    @ParameterizedTest
    @CsvSource({"3, 4, 12", "1, 1, 1", "9, 40, 360"})
    public void testArithmeticMultiply(int a, int b, int actual) {
        Assertions.assertEquals(Arithmetic.multiply(a, b), actual);
    }

    @DisplayName("Деление")
    @ParameterizedTest
    @CsvSource({"40, 4, 10", "1, 1, 1", "90, 3, 30"})
    public void testArithmeticDel(int a, int b, int actual) {
        Assertions.assertEquals(Arithmetic.del(a, b), actual);
    }

}

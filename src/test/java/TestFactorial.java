import Lesson_16.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestFactorial {

    @ParameterizedTest
    @CsvSource({"1,1", "3, 6", "6, 720"})
    public void testFactorial(int expected, int actual) {
        Assertions.assertEquals(Factorial.calculatorFactorial(expected), actual);
    }
}

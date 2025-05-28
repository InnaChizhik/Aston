import Lesson_16.Compare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCompare {
    @ParameterizedTest
    @CsvSource({"3, 3, Равны", "1, 0, Первое больше", "9, 40, Второе больше"})
    public void testCompareNumber(int x, int y, String actual) {
        Assertions.assertEquals(Compare.compareNumder(x, y), actual);
    }
}

import Lesson_16.Factorial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestFactorial {
    @DataProvider(name = "factorialData")
    public Object[][] provideFactorialData() {
        return new Object[][]{
                {1, 1},
                {3, 6},
                {6, 720}
        };
    }

    @Test(dataProvider = "factorialData")
    public void testFactorial(int input, int actual) {
        Assert.assertEquals(Factorial.calculatorFactorial(input), actual);
    }

}

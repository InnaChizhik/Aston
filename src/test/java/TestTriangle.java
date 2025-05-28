import Lesson_16.Factorial;
import Lesson_16.Triangle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestTriangle {

    @DataProvider(name = "triangleData")
    public Object[][] provideTriangleData() {
        return new Object[][]{
                {3, 4, 5, 6},
                {7, 24, 25, 84},
                {9, 40, 41, 180}
        };
    }

    @Test(dataProvider = "triangleData")
    public void testTriangleArea(int a, int b, int c, int actual) {
        Assert.assertEquals(Triangle.calculatorTriangleArea(a, b, c), actual);
    }
}

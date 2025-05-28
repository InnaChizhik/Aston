import Lesson_16.Arithmetic;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestArithmetic {

    public class ArithmeticTest {

        @DataProvider(name = "plusData")
        public Object[][] providePlusData() {
            return new Object[][]{
                    {3, 4, 7},
                    {1, 1, 2},
                    {9, 40, 49}
            };
        }

        @Test(dataProvider = "plusData")
        public void testArithmeticPlus(int a, int b, int actual) {
            Assert.assertEquals(Arithmetic.plus(a, b), actual);
        }
    }

    @DataProvider(name = "minusData")
    public Object[][] provideMinusData() {
        return new Object[][]{
                {3, 4, -1},
                {1, 1, 0},
                {9, 40, -31}
        };
    }

    @Test(dataProvider = "minusData")
    public void testArithmeticMinus(int a, int b, int actual) {
        Assert.assertEquals(Arithmetic.minus(a, b), actual);
    }

    @DataProvider(name = "multiplyData")
    public Object[][] provideMultiplyData() {
        return new Object[][]{
                {3, 4, 12},
                {1, 1, 1},
                {9, 40, 360}
        };
    }

    @Test(dataProvider = "multiplyData")
    public void testArithmeticMultiply(int a, int b, int actual) {
        Assert.assertEquals(Arithmetic.multiply(a, b), actual);
    }

    @DataProvider(name = "delData")
    public Object[][] provideDelData() {
        return new Object[][]{
                {40, 4, 10},
                {1, 1, 1},
                {90, 3, 30}
        };
    }

    @Test(dataProvider = "delData")
    public void testArithmeticDel(int a, int b, int actual) {
        Assert.assertEquals(Arithmetic.del(a, b), actual);
    }
}



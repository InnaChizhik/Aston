import Lesson_16.Compare;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCompare {
    @DataProvider(name = "compareData")
    public Object[][] provideCompareData() {
        return new Object[][]{
                {3, 3, "Равны"},
                {1, 0, "Первое больше"},
                {9, 40, "Второе больше"}
        };
    }

    @Test(dataProvider = "compareData")
    public void testCompareNumber(int x, int y, String actual) {
        Assert.assertEquals(Compare.compareNumder(x, y), actual);
    }
}

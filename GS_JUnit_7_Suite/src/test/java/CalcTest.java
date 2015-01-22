import org.junit.Assert;
import org.junit.Test;
import ru.javacourse.Calculator;

/**
 * Created by Georgy Gobozov on 11.01.2015.
 */

public class CalcTest {


    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(3, 2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testDiv() {
        int result = calculator.div(15, 3);
        Assert.assertEquals(5, result);
    }


}

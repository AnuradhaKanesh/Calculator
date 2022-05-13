import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

    @Test
    public void shouldGetSquareOfNumber() {
        int result = new Calculator().getSquareResult(5);
        Assert.assertEquals(25, result);

    }

    @Test
    public void shouldSubtractTwoNumbers() {

        int result = new Calculator().getSubtractionResult(50, 30);
        Assert.assertEquals(20, result);
    }


    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = new Calculator().getMultiplicationResult(10, 10);
        Assert.assertEquals(100, result);
    }

    @Test
    public void shouldGetPercentageOfTwoNumbers() {
        int result = new Calculator().getPercentageResult(300, 500);
        Assert.assertEquals(60, result);
    }

}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "Expected 2 + 3 to equal 5");
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Sample {

    @Test
    void additionTest() {
        // Arrange
        int num1 = 2;
        int num2 = 3;

        // Act
        int result = num1 + num2;

        // Assert
        assertEquals(5, result, "The addition result should be 5");
    }

    @Test
    void subtractionTest() {
        // Arrange
        int num1 = 5;
        int num2 = 3;

        // Act
        int result = num1 - num2;

        // Assert
        assertEquals(2, result, "The subtraction result should be 2");
    }

    @Test
    void multiplicationTest() {
        // Arrange
        int num1 = 4;
        int num2 = 6;

        // Act
        int result = num1 * num2;

        // Assert
        assertEquals(24, result, "The multiplication result should be 24");
    }
}

package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        Long number1 = 1L;
        Long number2 = 1L;

        // Act
        basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(2, 2);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    @Test
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second));
    }

    // Restas

    @Test
    @DisplayName("Testing resta: 2-1=1")
    public void rest() {
        Long number1 = 2L;
        Long number2 = 1L;

        // Act
        basicCalculator.res(number1, number2);

        // Assert
        assertEquals(1, 1);
    }

    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "1,    2,   -1",
            "51,  49, 2",
            "100,  1, 99"
    })
    @Test
    public void severalRest(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.res(first, second));
    }

    // Multiplicaciones

    @Test
    @DisplayName("Testing multi: 2*2=4")
    public void multi() {
        Long number1 = 2L;
        Long number2 = 2L;

        // Act
        basicCalculator.multi(number1, number2);

        // Assert
        assertEquals(4, 4);
    }

    @DisplayName("Testing several multi")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2,    0,   0",
            "4,    4,   16",
            "9,  7, 63",
            "12,  12, 144"
    })
    @Test
    public void severalMulti(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multi(first, second));
    }

    // Divisiones

    @Test
    @DisplayName("Testing div: 9/3=3")
    public void div() {
        Long number1 = 9L;
        Long number2 = 3L;

        // Act
        basicCalculator.div(number1, number2);

        // Assert
        assertEquals(3, 3);
    }

    @DisplayName("Testing several div")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "8,    2,   4",
            "120,    10,   12",
            "32,  4, 8",
            "12,  12, 1"
    })
    @Test
    public void severalDiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second));
    }
}

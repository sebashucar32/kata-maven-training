package co.com.sofka.app.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public static Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public static Long res(Long number1, Long number2) {
        logger.info( "subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public static Long multi(Long number1, Long number2) {
        logger.info( "multiplying {} - {}", number1, number2 );
        return number1 * number2;
    }

    public static Long div(Long number1, Long number2) {
        logger.info( "dividing {} - {}", number1, number2 );

        if(number2 == 0) {
            throw new ArithmeticException("No se puede dividir en cero!!!");
        }

        return number1 / number2;
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {

    CreditCalculator calculator = new CreditCalculatorImpl();

    @Test
    void testMonthlyPayments() {
        int expected = 9333;
        int actual = calculator.calculateMonthlyPayment(100_000, 12);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTotalSum() {
        int expected = 112_000;
        int actual = calculator.calculateTotalCreditSum(100_000, 12);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverpayment() {
        int expected = 12000;
        int actual = calculator.calculateOverpayment(100_000, 12);

        Assertions.assertEquals(expected, actual);
    }
}

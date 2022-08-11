public class CreditCalculatorImpl implements CreditCalculator {

    @Override
    public int calculateMonthlyPayment(int n, int m) {
        int totalSum = (int) (n * (m * 0.01) + n);
        return totalSum / m;
    }

    @Override
    public int calculateTotalCreditSum(int n, int m) {
        return (int) (n * (m * 0.01) + n);
    }

    @Override
    public int calculateOverpayment(int n, int m) {
        int totalSum = (int) (n * (m * 0.01) + n);
        return totalSum - n;
    }
}

public interface CreditCalculator {

    int calculateMonthlyPayment(int n, int m);

    int calculateTotalCreditSum(int n, int m);

    int calculateOverpayment(int n, int m);
}

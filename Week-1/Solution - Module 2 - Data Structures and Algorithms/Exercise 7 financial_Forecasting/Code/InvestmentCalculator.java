public class InvestmentCalculator {

    public double forecast(double principal, double rate, int time) {
        if (time == 0) {
            return principal;
        }
        return forecast(principal * (1 + rate), rate, time - 1);
    }
}


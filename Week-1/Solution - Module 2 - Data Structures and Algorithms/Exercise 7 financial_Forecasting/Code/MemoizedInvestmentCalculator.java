import java.util.HashMap;
import java.util.Map;

public class MemoizedInvestmentCalculator {

    private final Map<Integer, Double> memo = new HashMap<>();

    public double forecast(double principal, double rate, int time) {
        if (time == 0) {
            return principal;
        }

        if (memo.containsKey(time)) {
            return memo.get(time);
        }

        double result = forecast(principal, rate, time - 1) * (1 + rate);
        memo.put(time, result);
        return result;
    }
}

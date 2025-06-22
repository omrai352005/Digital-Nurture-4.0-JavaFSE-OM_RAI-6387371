import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter annual rate (in %): ");
        double ratePercent = scanner.nextDouble();
        double rate = ratePercent / 100.0;

        System.out.print("Enter time in years: ");
        int time = scanner.nextInt();

        // Basic Recursive Calculation
        InvestmentCalculator calc = new InvestmentCalculator();
        double forecastValue = calc.forecast(value, rate, time);
        System.out.printf("Future Value (Recursive): %.2f\n", forecastValue);

        // Optimized with Memoization
        MemoizedInvestmentCalculator memoCalc = new MemoizedInvestmentCalculator();
        double forecastMemo = memoCalc.forecast(value, rate, time);
        System.out.printf("Future Value (Memoized): %.2f\n", forecastMemo);

        scanner.close();
    }
}

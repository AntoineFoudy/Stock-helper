import java.util.Scanner;

public class POCF {
    private double marketCap;
    private double operatingCashFlow;

    public void setOperatingCashFlow(double marketCap) {
        this.marketCap = marketCap;
    }

    public void setMarketCap(double operatingCashFlow) {
        this.operatingCashFlow = operatingCashFlow;
    }

    public double getOperatingCashFlow() {
        return marketCap / operatingCashFlow;
    }
}
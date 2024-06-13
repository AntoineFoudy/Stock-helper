import java.util.Scanner;

public class PEBITDA {
    private double marketCap;
    private double ebitda;


    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public void setEbitda(double ebitda) {
        this.ebitda = ebitda;
    }

    public double getPriceToEbitda() {
        return marketCap / ebitda;
    }
}
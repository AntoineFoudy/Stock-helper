import java.util.Scanner;

public class PS {
    private double marketCap;
    private double sales;


    public void setMarketCap(double marketCap) {

        this.marketCap = marketCap;
    }

    public void setSales(double sales) {

        this.sales = sales;
    }

    public double getPriceToSales() {

        return marketCap / sales;
    }
}


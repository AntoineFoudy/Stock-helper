import java.util.Scanner;

public class StockApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to calculate a price multiple Enter 2 to open a stock on the website");
        String option = scanner.nextLine();

        if (option.equals("1")) {
            System.out.println("Press 1 for P/S press 2 for P/OCF press 3 for P/EBITDA");
            String option1 = scanner.nextLine();

            // Using switch statements to execute the needed class
            switch (option1) {
                // Price to Sales
                case "1":
                    System.out.println("What is the market cap of the stock");
                    double marketCap = scanner.nextDouble();

                    System.out.println("What is the TTM of sales/revenue of the stock");
                    double sales = scanner.nextDouble();

                    PS ps = new PS();
                    ps.setMarketCap(marketCap);
                    ps.setSales(sales);
                    // Runs the calcluation and gets the answer
                    double priceToSales = ps.getPriceToSales();
                    System.out.println("The price to sales ratio is " + priceToSales);



                    break;
                // Price to Operating Cash Flow
                case "2":
                    POCF pocf = new POCF();
                    break;
                // Price to EBITDA
                case "3":
                    PEBITDA pebitda = new PEBITDA();
                    break;
                // Incase user inputs an invalid option
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } else if (option.equals("2")) {
            System.out.println("What is the ticker symbol you want to open up");
            String tickerSymbol = scanner.nextLine();

            // Instantiates the object
            Websearch websearch = new Websearch();
            // Set the tickerSymbol for the object to use
            websearch.setTickerSymbol(tickerSymbol);
            websearch.open();

        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}

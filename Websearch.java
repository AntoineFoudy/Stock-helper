import java.awt.Desktop;
import java.net.URI;

public class Websearch {
    private String tickerSymbol;
    private String basicURL;


    // Method to set user's desired ticker symbol
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public void open() {

                basicURL = "https://stockunlock.com/stockDetails/"+tickerSymbol+"/general";
        System.out.println(basicURL);

        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(basicURL));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}

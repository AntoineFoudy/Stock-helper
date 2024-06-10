import java.util.Scanner;

public class StockApp {

    public static void main(String[] args) {

        Scanner operation = new Scanner(System.in);
        System.out.println("Enter 1 to calculate a price multiple Enter 2 to open a stock on the webiste");

        String option = operation.nextLine();

        if (option.equals("1")) {
            // Making a new scanner to find out what calulations user wants to run
            Scanner input1 = new Scanner(System.in);
            System.out.println("Press 1 for P/S press 2 for P/OCF press 3 for P/EBITDA");
            String option1 = input1.nextLine();

            // Using switch statements to execute the needed class
            switch (option1) {
                // Price to Sales
                case "1":
                    PS ps = new PS();
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
                    operation.close();

            }
            input1.close();


        } else if (option.equals("2")) {
            Websearch websearch = new Websearch();
        } else {
            System.out.println("Invalid option");
            operation.close();
        }
    }
}
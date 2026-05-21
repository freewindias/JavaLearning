public class challenge {

    public static void main(String[] args) {
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;

        System.out.println("Initial amount in USD: " + amountInUSD + " USD");

        double amountInEUR = amountInUSD * exchangeRateUSDToEUR;

        System.out.println("Converted amount in EURO: " + amountInEUR + " EUR");

        amountInEUR -= 55;

        System.out.println("EURO amount after reducing: " + amountInEUR + " EUR");

        double convertEURtoUSD = amountInEUR / exchangeRateUSDToEUR;

        System.out.println("Final EURO converted to USD: " + convertEURtoUSD + " USD");
    }
}
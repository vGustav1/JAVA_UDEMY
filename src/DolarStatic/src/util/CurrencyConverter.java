package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double dollarToReal(double amount, double price) {
        return amount * price * (1.0 + IOF);


    }
}
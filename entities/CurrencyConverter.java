package entities;

public class CurrencyConverter {

    public double priceDollar;
    public double dollar;

    public static double iof(double pD, double dlr){
        return (pD * dlr) + (pD * dlr * 0.06);
    }


}

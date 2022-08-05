package com.dp;

public class FactoryMethodClient {

    public static void main(String[] args) {

        String country1 = "India";
        Currency currency1 = CurrencyFactory.createCurrency(country1);
        System.out.println("Currency for "+country1+" is "+currency1.getSymbol());

        String country2 = "France";
        Currency currency2 = CurrencyFactory.createCurrency(country2);
        System.out.println("Currency for "+country2+" is "+currency2.getSymbol());

        String country3 = "USA";
        Currency currency3 = CurrencyFactory.createCurrency(country3);
        System.out.println("Currency for "+country3+" is "+currency3.getSymbol());


    }
}

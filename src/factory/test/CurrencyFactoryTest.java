package factory.test;

import factory.domain.Country;
import factory.domain.Currency;
import factory.domain.CurrencyFactory;

public class CurrencyFactoryTest {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());

        Currency currency2 = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency2.getSymbol());
    }
}

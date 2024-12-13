package data_transfer_object;

import builder.domain.Person;
import factory.domain.Country;
import factory.domain.Currency;
import factory.domain.CurrencyFactory;
import singleton.domain.Aircraft;

public class TestReportDto {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("0101");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Dennis")
                .lastName("Silva")
                .email("dennis.silva@example.com")
                .nickname("dennissil")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .personFirstName(person.firstName())
                .currency(currency)
                .build();

        System.out.println(reportDto);
    }
}

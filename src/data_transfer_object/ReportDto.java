package data_transfer_object;

import factory.domain.Country;
import factory.domain.Currency;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personFirstName;

    private ReportDto(String aircraftName, Country country, Currency currency, String personFirstName) {
        this.aircraftName = aircraftName;
        this.country = country;
        this.currency = currency;
        this.personFirstName = personFirstName;
    }

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personFirstName;

        public ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personFirstName(String personFirstName) {
            this.personFirstName = personFirstName;
            return this;
        }

        public ReportDto build(){
            return new ReportDto(aircraftName, country, currency, personFirstName);
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency.getSymbol() +
                ", personFirstName='" + personFirstName + '\'' +
                '}';
    }
}

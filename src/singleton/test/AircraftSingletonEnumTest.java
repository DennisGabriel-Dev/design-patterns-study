package singleton.test;

import singleton.domain.AircraftSingletonEnum;

public class AircraftSingletonEnumTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    public static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instnce = AircraftSingletonEnum.INSTANCE;
        System.out.println(instnce.bookSeat(seat));
    }
}

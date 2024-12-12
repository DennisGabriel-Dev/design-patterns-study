package singleton.test;

import singleton.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        System.out.println(AircraftSingletonLazy.getINSTANCE());
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }
}

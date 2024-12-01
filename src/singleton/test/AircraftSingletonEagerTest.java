package singleton.test;

import singleton.domain.Aircraft;
import singleton.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingletonEager airCraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(airCraft); // same memory address each call
        System.out.println(airCraft.bookSeat(seat));
    }
}

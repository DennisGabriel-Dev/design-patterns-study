package singleton.test;

import singleton.domain.Aircraft;

public class AircraftTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft airCraft = new Aircraft("0001-123");
        System.out.println(airCraft); // not same memory address each call
        System.out.println(airCraft.bookSeat(seat));
    }
}

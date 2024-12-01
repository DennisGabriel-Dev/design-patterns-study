package singleton.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("0001-234");
    private final Set<String> availablesSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name){
        this.name = name;
    }

    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availablesSeats.remove(seat);
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }
}

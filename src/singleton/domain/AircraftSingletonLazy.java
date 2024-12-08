package singleton.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availablesSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name){
        this.name = name;
    }

    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availablesSeats.remove(seat);
    }

    public static AircraftSingletonLazy getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new AircraftSingletonLazy("0001-234");
        }
        return INSTANCE;
    }
}

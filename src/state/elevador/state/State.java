package state.elevador.state;

public abstract class State {
    Elevador elevador;

    State(Elevador elevador){
        this.elevador = elevador;
    }

    public abstract String goAhead();
    public abstract String goDown();
    public abstract String stop();
}

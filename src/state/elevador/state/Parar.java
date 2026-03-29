package state.elevador.state;

public class Parar extends State {
    Parar(Elevador elevador){
        super(elevador);
    }

    @Override
    public String goAhead() {
        return "Você não pode ir para cima, o elevador está parando!";
    }

    @Override
    public String goDown() {
        return "Você não pode ir para baixo, o elevador está parando!";
    }

    @Override
    public String stop() {
        return "Elevador parou!";
    }
}

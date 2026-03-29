package state.elevador.state;

public class Subir extends State {
    Subir(Elevador elevador) {
        super(elevador);
    }

    @Override
    public String goAhead() {
        return "Indo para cima";
    }

    @Override
    public String goDown() {
        return "Aguarde, o elevador está subindo";
    }

    @Override
    public String stop() {
        return "Você não tem permissão para parar o elevador";
    }
}

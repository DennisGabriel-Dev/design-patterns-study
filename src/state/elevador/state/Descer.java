package state.elevador.state;

public class Descer extends State{
    Descer(Elevador elevador) {
        super(elevador);
    }

    @Override
    public String goAhead() {
        return "Aguarde um pouco o elevador está subindo";
    }

    @Override
    public String goDown() {
        return "Indo para baixo";
    }

    @Override
    public String stop() {
        return "Você não pode parar o elevador agora";
    }
}

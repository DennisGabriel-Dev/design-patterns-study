package state.elevador.state;

public class Elevador {
    public Elevador(){
        new Parar(new Elevador());
    }


}

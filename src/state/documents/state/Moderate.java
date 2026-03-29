package state.documents.state;

public class Moderate extends State {
    public Moderate(Document document) {
        super(document);
    }

    @Override
    public String draft(Document document) throws Exception {
        return "Documento retornado para edição";
    }

    @Override
    public String moderate(Document document) throws Exception {
        throw new Exception("Documento já se encontra na moderação");
    }

    @Override
    public String publish(Document document) {
        return "Documento publicado com sucesso";
    }
}

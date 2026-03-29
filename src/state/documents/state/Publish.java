package state.documents.state;

public class Publish extends State {
    Publish(Document document) {
        super(document);
    }

    @Override
    public String draft(Document document) throws Exception {
        throw new Exception("Documento não pode voltar para draft");
    }

    @Override
    public String moderate(Document document) throws Exception {
        throw new Exception("Documento não pode voltar para moderação");
    }

    @Override
    public String publish(Document document) throws Exception {
        return "Documento já foi publicado!";
    }
}

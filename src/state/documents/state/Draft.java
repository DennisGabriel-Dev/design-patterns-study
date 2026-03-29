package state.documents.state;

public class Draft extends State {
    Draft(Document document) {
        super(document);
    }

    @Override
    public String draft(Document document) {
        return "Documento está sendo escrito";
    }

    @Override
    public String moderate(Document document) throws Exception {
        document.changeState(new Moderate(document));
        return "Documento enviado para moderação";
    }

    @Override
    public String publish(Document document) throws Exception {
        if(document.userIsAdmin()){
           document.changeState(new Publish(document));
           return "Documento publicado!";
        }
        throw new Exception("Você não possui permissão para executar essa ação!");
    }
}

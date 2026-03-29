package state.documents.state;

public abstract class State {
    Document document;
    State(Document document){
        this.document = document;
    }
    public abstract String draft(Document document) throws Exception;
    public abstract String moderate(Document document) throws Exception;
    public abstract String publish(Document document) throws Exception;
}

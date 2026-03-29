package state.documents.state;

public class Test {
    static void main() throws Exception {
        Document document = new Document();
        document.state.publish(document);
        //document.state.draft(document);
    }
}

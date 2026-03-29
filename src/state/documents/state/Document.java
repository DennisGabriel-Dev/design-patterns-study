package state.documents.state;

public class Document {
    private String kindUser = "admin";
    public State state;

    public Document(){
        this.state = new Draft(this);
    }

    public void setKindUser(String kindUser) {
        this.kindUser = kindUser;
    }

    public String getKindUser() {
        return kindUser;
    }

    public boolean userIsAdmin(){
        return kindUser.equals("admin");
    }

    public void changeState(State state) {
        this.state = state;
    }
}

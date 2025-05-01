package observer;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Observer obs1 = new ConcreteObserver("Observer 1");
		Observer obs2 = new ConcreteObserver("Observer 2");
		
		subject.attachObserver(obs1);
		subject.attachObserver(obs2);
		
		subject.notifyObservers("Hello!!");

	}

}

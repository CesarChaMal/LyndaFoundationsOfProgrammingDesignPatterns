import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(Subject subject) {
        observerList.forEach(observer -> observer.update(subject));
    }
}

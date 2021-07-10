package Observer;


import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> observadores = new ArrayList<Observer>();
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyAllObservers();
    }

    public void addObserver(Observer observer){
        observadores.add(observer);
    }

    public void notifyAllObservers(){
        observadores.forEach(x -> x.update());
    }


}

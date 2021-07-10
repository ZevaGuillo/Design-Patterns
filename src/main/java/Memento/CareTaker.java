package Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> stackMemento;

    public CareTaker() {
        this.stackMemento = new Stack<Memento>();
    }

    public Memento pop(){
        return stackMemento.pop();
    }

    public void push(Memento memento){
        stackMemento.push(memento);
    }

}

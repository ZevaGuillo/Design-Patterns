package Memento;

public class Originador {

    private Object estado;

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    public Memento crearMemento(){
        Memento memento = new Memento(estado);
        return memento;
    }

    public void restaurar (Memento memento){
        this.estado = memento.getMementoEstado();
    }

}

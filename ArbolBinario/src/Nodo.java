import java.util.ArrayList;
import java.util.List;

public class Nodo implements Comparable<Nodo>{
    private Nodo hijoIzquierda;
    private Nodo hijoDerecha;
    private Nodo padre;
    private int valor;
    public Nodo(int valor){
        this.hijoDerecha = null;
        this.hijoIzquierda = null;
        this.valor = valor;
    }

    public Nodo getHijoIzquierda() {
        return hijoIzquierda;
    }

    public Nodo getHijoDerecha() {
        return hijoDerecha;
    }

    public Nodo getPadre() {
        return padre;
    }

    public int getValor() {
        return valor;
    }

    public void setHijoIzquierda(Nodo hijoIzquierda) {
        this.hijoIzquierda = hijoIzquierda;
    }

    public void setHijoDerecha(Nodo hijoDerecha) {
        this.hijoDerecha = hijoDerecha;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    @Override
    public int compareTo(Nodo otroNodo) {
        return Integer.compare(this.getValor(), otroNodo.getValor());
    }

}

public class Arbol{
    private Nodo raiz;
    public Arbol (){
        this.raiz = null;
    }
    public Nodo getRaiz() {
        return raiz;
    }
    public void addNodo (Nodo nodo){
        if (raiz == null)
            raiz = nodo;
        else
            agregarRecursivo(raiz, nodo);
    }
    public void agregarRecursivo(Nodo nodoActual, Nodo nodoNuevo){
        if (nodoNuevo.compareTo(nodoActual) < 0){
            if (nodoActual.getHijoIzquierda() == null){
                nodoNuevo.setPadre(nodoActual);
                nodoActual.setHijoIzquierda(nodoNuevo);
            } else
                agregarRecursivo(nodoActual.getHijoIzquierda(), nodoNuevo);
        } else {
            if (nodoActual.getHijoDerecha() == null){
                nodoNuevo.setPadre(nodoActual);
                nodoActual.setHijoDerecha(nodoNuevo);
            } else
                agregarRecursivo(nodoActual.getHijoDerecha(), nodoNuevo);
        }
    }

    public void recorridoInorden(AccionEjecutable accion) {
        recorrido(raiz, accion);
    }
    private void recorrido(Nodo nodo, AccionEjecutable accion) {
        if (nodo != null){
            recorrido(nodo.getHijoIzquierda(), accion);
            accion.ejecutar(nodo);
            recorrido(nodo.getHijoDerecha(), accion);
        }
    }
}
